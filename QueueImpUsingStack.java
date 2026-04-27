import java.util.Stack;

public class QueueImpUsingStack {

    Stack<Integer> st1;
    Stack<Integer> st2;

    QueueImpUsingStack(){
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    void enqueue(int val){
        st1.push(val);
        System.out.println("Enqueued " + val + " to queue");
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty, cannot remove element");
            return -1;
        }
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty, cannot remove element");
            return -1;
        }
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.peek(); 
    }

    boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }
    public static void main(String[] args) {
        QueueImpUsingStack queue = new QueueImpUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element is: " + queue.peek());
    }
}
