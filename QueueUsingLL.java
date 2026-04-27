class Node {
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class QueueUsingLL {

    Node head;

    void enqueue(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            System.out.println("Enqueued " + val + " to queue");
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        System.out.println("Enqueued " + val + " to queue");
    }


    int dequeue(){
        if(head == null){
            System.out.println("Queue is Empty, cannot remove element");
            return -1;
        }

        int ele = head.data;
        head = head.next;
        return ele;
    }


    boolean isEmpty(){
        return head == null;
    }

    void DisplayQueue(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.DisplayQueue();
        System.out.println("\nDequeued element: " + queue.dequeue());
        queue.DisplayQueue();
        queue.enqueue(60);
        System.out.println("\nIs queue empty? " + queue.isEmpty());
        queue.DisplayQueue();

    }
}
