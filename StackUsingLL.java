class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class StackUsingLL {

    Node top;

    StackUsingLL(){
        this.top = null;
    }

    void push(int val){
        Node newNode = new Node(val);

        if(top == null){
           top = newNode; 
           System.out.println("Pushed " + val + " to stack");
           return;
        }

        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + val + " to stack");
    }

    int pop(){
        if(top == null){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int ele = top.data;
        top = top.next;
        return ele;
    }

    int peek(){
         if(top == null){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }



    public static void main(String[] args) {
        StackUsingLL st = new StackUsingLL();

        System.out.println("Is stack empty? " + st.isEmpty());

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);    

        System.out.println("Top element is: " + st.peek());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Popped element is: " + st.pop());
        System.out.println("Top element is: " + st.peek());
        System.out.println("Is stack empty? " + st.isEmpty());
    }
}
