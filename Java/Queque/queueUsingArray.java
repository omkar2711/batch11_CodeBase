
public class queueUsingArray {
    int capacity;
    int queue[];
    int front;
    int rear;

    queueUsingArray(int cap){
        capacity = cap;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    void Enqueue(int val){
        if((rear + 1)%capacity == front){
            System.out.println("Queue overflow");
            return;
        }

        if(front == -1){
            front = 0;
        }

        rear = (rear+1) % capacity;
        queue[rear] = val;

        System.out.println(val + " Element inserted");
    }

    int dequeue(){
        if(front == -1){
            System.out.println("Queue UnderFlow");
            return -1;
        }
        int ele = queue[front];
        if(front == rear){
            front = rear-1;
        }
        else{
            front = (front+1) % capacity;
        }
        return ele;
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Queue elements:");

        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }

        System.out.println();
    }
    
    public static void main(String[] args) {
        queueUsingArray Qu = new queueUsingArray(10);
        Qu.Enqueue(10);
        Qu.Enqueue(20);
        Qu.Enqueue(30);
        Qu.Enqueue(40);
        Qu.Enqueue(50);
        Qu.Enqueue(60);
        Qu.Enqueue(70);
        Qu.Enqueue(80);
        Qu.Enqueue(90);
        Qu.Enqueue(100);

        Qu.dequeue();
        Qu.Enqueue(110);

        Qu.display();
    
    }   
}
