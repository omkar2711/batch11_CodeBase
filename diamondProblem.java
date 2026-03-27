class parent {
    void display(){
        System.out.println("This is a parent class");
    }
}


interface A {
    void display();
}

interface B {
    void display();
}

class C implements A,B{
    public void display(){
        System.out.println("This is a C class");
    }
}


public class diamondProblem {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
