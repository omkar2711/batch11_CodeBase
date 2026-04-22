class stackimp{
    int top;
    int arr[];
    int capacity;

    stackimp(int capacity){
        top = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack UnderFlow");
            return;
        }

        top++;
        arr[top] = val;
        System.out.println("element "+val+" Added to stack");        
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int ele = arr[top];
        top--;
        return ele;
    }

    int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(top == capacity - 1){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        stackimp st = new stackimp(5);
        System.out.println("Is Stack full: "+st.isFull());
        System.out.println("Is Stack empty: "+st.isEmpty());

        // Adding element in Stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("Is Stack full "+ st.isFull());

        //Removing ELement in Stack
        System.out.println("Element "+st.pop()+" is popped");
        System.out.println("Element "+st.pop()+" is popped");
        System.out.println("Element "+st.pop()+" is popped");

        //Peeking ELement from the stack
        System.out.println(st.peek());
        //stack empty & full checking
        System.out.println("Is Stack full "+ st.isFull());
        System.out.println("Is Stck empty "+ st.isEmpty());
    }
}