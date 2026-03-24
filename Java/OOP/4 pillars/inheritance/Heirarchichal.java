class a{
    void display(){
        System.out.println("This is in class a");
    }
}
class b extends a{
    void display1(){
        System.out.println("This is in class b extending class a");
    }
}
class c extends a{
    void display2(){
        System.out.println("This is in class c extending class a");
    }
}

public class Heirarchichal {
    public static void main(String[] args) {
        c ce = new c();
        ce.display();
        ce.display2();
    }
}
