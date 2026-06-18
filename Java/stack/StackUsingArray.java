public class StackUsingArray {
    int capacity;
    int[] stack;
    int top;

    StackUsingArray(int cap){
        this.capacity = cap;
        stack = new int[capacity];
        top = -1;
    }

    void push(int val){
        if(top == capacity-1){
            System.out.print("Stack Overflow");
            return ;
        }
        top++;
        stack[top] = val;
        System.out.println(val +" Element Successfully added to stack");
    }


    void pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
            return;
        }    
        int ele = stack[top];
        top--;
        System.out.println( ele + " Element removed from stack");
    }
    int peek(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top];
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(top == capacity-1){
            return true;
        }
        return false;
    }

    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack Elements are: ");
        for(int i = 0;i<=top;i++){
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args) {

        StackUsingArray st = new StackUsingArray(10);
        System.out.println(st.isEmpty());
        
        System.out.println("Stack Before adding elements");
        st.display();

        System.out.println("Stack after adding elements");
        st.display();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(80);
        st.push(90);
        st.push(100);
        st.push(100);
        System.out.println();
        System.out.println(st.isFull());

        System.out.println();
        System.out.println("Stack After POP");
        st.pop();
        st.display();

        System.out.println(st.isFull());
    }
}