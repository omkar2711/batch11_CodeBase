class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class Listimp {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node newNode1 = new Node(20);
        head.next = newNode1;
        Node newNode2 = new Node(30);
        newNode1.next = newNode2;
        Node newNode3 = new Node(40);
        newNode2.next = newNode3;
        Node newNode4 = new Node(50);
        newNode3.next = newNode4;
        Node newNode5 = new Node(60);
        newNode4.next = newNode5;

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
