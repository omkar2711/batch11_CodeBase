class Node {
    int data;
    Node next;
    Node prev;

    Node(int val){
        this.data = val;
        this.next = null;
        this.prev = null;
    }
}

public class LinkedListImp1 {

    Node head;

    void addLast(int val){

        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void addAtStart(int val){

        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    void addAtPos(int val, int pos){
        Node newNode = new Node(val);
        // System.out.println(head);
        if(head == null ){ //check if linked list is empty
            head = newNode;
            return;
        }
        if(pos < 0){
            System.out.println("Invalid Position");
            return;
        }
        if(pos == 0){
            addAtStart(val);
            return;
        }

        Node curr = head;
        for (int i = 0; i < pos-1; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next.prev = newNode;

        curr.next = newNode;
        newNode.prev = curr;

    }

    void deleteAtStart(){
        if(head == null){
            System.out.println("Empty linked list");
            return;
        }

        head = head.next;
    }

    void deleteAtEnd(){
        if(head == null){
            System.out.println("Empty Linked list");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }

    void deleteAtPos(int pos){
        if(head == null){
            System.out.println("Empty linked list");
            return;
        }
        if(head.next == null && pos == 0){
            head = null;
            return;
        }
        if(pos == 0){
            deleteAtStart();
            return;
        }
        Node curr = head;
        for(int i = 0;i<pos-1;i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;
    }

    void displayList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedListImp1 list = new LinkedListImp1();

        list.addLast(10); 
        list.addLast(20); 
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.addAtStart(5); 
        list.addAtStart(2);
        list.addAtPos(25, 4);
        list.deleteAtStart();
        list.deleteAtEnd();

        list.deleteAtPos(3);

        list.displayList();

        
    }
}
