class Node{
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;
    }
}

public class StackUsingLinkedList {
    Node top;
    
    void Push(int val){
        Node newNode = new Node(val);

        newNode.next = top;
        top = newNode;
        System.out.println(top.data + " Element saved in stack");
    }

    int pop(){
        if(top == null){
            System.out.println("Stack UnderFlow");
        }
        
        int ele = top.data;
        top = top.next;
        return ele;
    }

    int peek(){
        if(top == null){
            System.out.println("Stack underflow");
            return -1;
        }
        int ele = top.data;
        return ele;
    }

    boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }
    
    void display(){
        if(top == null){
            System.out.println("Stack is Empty");
            return;
        }

        Node curr = top;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        
        st.Push(10);
        st.Push(20);
        st.Push(30);
        st.Push(40);
        st.Push(50);

        System.out.println(st.peek());
        st.pop();

        System.out.println(st.isEmpty());
        
        st.display();
    }    
}
