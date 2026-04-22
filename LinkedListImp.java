class Node {
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class LinkedListImp {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node newNode1 = new Node(20);
        head.next = newNode1;
        Node newNode2 = new Node(30);
        newNode1.next = newNode2;
        Node newNode3 = new Node(40);
        newNode2.next = newNode3;

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
