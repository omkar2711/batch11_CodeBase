class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}


public class stackUsingLinkList {
    Node top;
    void push(int val){
        Node newNode = new Node(val);
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
        System.out.println("Element "+val+" added");
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
            return -1;
        }
        return top.data;
    }

    boolean isEmpty(){
        if(top == null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        stackUsingLinkList st = new stackUsingLinkList();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("Element " + st.pop()+ " Has Been Popped");
        System.out.println("Element " + st.pop()+ " Has Been Popped");
        System.out.println("Element " + st.pop()+ " Has Been Popped");
        System.out.println("Element " + st.pop()+ " Has Been Popped");
        System.out.println("Element " + st.pop()+ " Has Been Popped");
        System.out.println("Element " + st.pop()+ " Has Been Popped");
        System.out.println("Top Element: "+st.peek());
        System.out.println("Is Stack empty: "+st.isEmpty());
    }
    
}
