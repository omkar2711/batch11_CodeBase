class Student{
    void display(){
        System.out.println("This is Vedant");
    }

}
class Studenttwo extends Student{
    @Override
    void display(){
        System.out.println("This is Kumud");
    }
}
public class runtime {
    public static void main(String[] args) {
      Student st = new Studenttwo();
      st.display();  
    }
}
