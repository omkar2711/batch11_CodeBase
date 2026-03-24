class a {
    void display(){
        System.out.println("this is class a");
    }
}
class b extends a{
    void display1(){
        System.out.println("This is class b extending a ...");
    }
}
class c extends b{
    void display2(){
        System.out.println("This is class c extending b ...");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        c ce = new c();
        ce.display();
        ce.display1();
        ce.display2();
    }
}
