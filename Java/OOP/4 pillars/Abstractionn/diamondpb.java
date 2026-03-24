// Solving Diamond Problem
interface A{
    abstract void show();
}
interface B{
    abstract void display();
}

class C implements A,B{
    public void show(){
        System.out.println("This comes From A");
    };
    public void display(){
        System.out.println("This comes From B");
    };
}


public class diamondpb {
  public static void main(String[] args) {
    C ce = new C();
    ce.show();
    ce.display();
  }  
}
