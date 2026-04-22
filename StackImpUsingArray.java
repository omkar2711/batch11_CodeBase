

public class StackImpUsingArray {

    int top;
    int[] arr;
    int capacity;

    StackImpUsingArray(int capacity){
        top = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void push(int val){
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = val;
        System.out.println("Pushed " + val + " to stack");
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        
        int ele = arr[top];
        top--;
        return ele;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }

    int size(){
        return top + 1;
    }

    boolean isFull(){
        return top == capacity - 1;
    }


    public static void main(String[] args) {
        StackImpUsingArray st = new StackImpUsingArray(5);

        System.out.println("Is stack empty? " + st.isEmpty());

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("Is stack full? " + st.isFull());

        System.out.println("Top element is: " + st.peek());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Top element is: " + st.peek());
        System.out.println("Stack size is: " + st.size());
        System.out.println("Is stack empty? " + st.isEmpty());
        System.out.println("Is stack full? " + st.isFull());
    }
}
