class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class LinkedListImp {
    Node head;  

    void addAtLast(int val){
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
        head = newNode;
    }

    void inBetween(int val, int pos){
        Node newNode = new Node(val);
        Node curr = head;
        if(head == null){
            head = newNode;
            return;
        }
        if(pos == 0){
            newNode.next = head;
            head = newNode;
        }
        for(int i=0;i<pos-1;i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    void deleteAtStart(){
        if(head == null){
            System.out.println("No Element to Delete"); 
            return;
        }
        head = head.next;
    }


    void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;

        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);
        list.addAtLast(60);
        list.addAtLast(70);

        list.addAtStart(5);
        list.addAtStart(4);
        list.addAtStart(3);
        list.addAtStart(2);
        list.addAtStart(1);

        list.deleteAtStart();

        list.display();


    }
}
