class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class queueUsingLinkedList {
    Node front;

    void Enqueue(int val){
        Node newNode = new Node(val);
        if(front == null){
           front = newNode;
           System.out.println(front.data + " Element Added to Queue");
           return;
        }
        Node rear = front;
        while(rear.next != null){
            rear = rear.next;
        }
        rear.next = newNode;
        int ele = rear.data;
        System.out.println(ele + " Element Added to Queue");
    }

    void Dequeue(){
        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }
        int ele = front.data;
        front = front.next;
        System.out.println("Element " + ele + " Has Removed");
    }

    boolean isEmpty(){
        if(front == null){
            System.out.println("Queue is Empty");
            return true;
        }
        return false;
    }

    void peek(){
        if(front == null){
            System.out.println(-1);
            return;
        }
        System.out.print(front.data);
    }

    void Size(){
        int count = 0;
        Node curr = front;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        queueUsingLinkedList Qu = new queueUsingLinkedList();
        Qu.Enqueue(10);
        Qu.Enqueue(20);
        Qu.Enqueue(30);
        Qu.Enqueue(40);
        Qu.Enqueue(50);

        Qu.Dequeue();
        
        Qu.peek();
        
        System.out.println();
        System.out.println(Qu.isEmpty());

        Qu.Size();
        
    }
}
