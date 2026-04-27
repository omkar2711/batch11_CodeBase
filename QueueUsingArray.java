public class QueueUsingArray {

    int arr[];
    int front;
    int rear;
    int capacity;


    QueueUsingArray(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    void enqueue(int val){
        if((front == 0 && rear == capacity - 1)){
            System.out.println("Queue is Full, cannot add element");
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment.  5
        arr[rear] = val;
        System.out.println("Enqueued " + val + " to queue");
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty, cannot remove element");
            return;
        }
        System.out.println("Dequeued " + arr[front] + " from queue");
        front = (front + 1) % capacity; // Circular increment.
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty, cannot peek element");
            return -1;
        }
        System.out.println("Front element is " + arr[front]);
        return arr[front];
    }

     boolean isEmpty(){
        return front == 0 && rear == -1;
    }

    void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty, cannot display elements");
            return;
        }
        System.out.print("Queue elements: ");
        for(int i = front; i != rear; i = (i + 1) % capacity){
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[rear]); // Print the last element
    }
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        queue.peek();
        queue.dequeue();
        queue.dequeue();
    
        queue.enqueue(60);
        queue.enqueue(70);
        queue.displayQueue();
    }
}
