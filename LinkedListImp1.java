class Node {
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
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

        list.displayList();

        
    }
}
