import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImp {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);  
        System.out.println("Queue elements: " + queue);
        System.out.println("Dequeued element: " + queue.remove());
        System.out.println("Queue elements after dequeue: " + queue);
        //peek
        System.out.println("Front element is: " + queue.peek());
    }
}
