class Animal{
    String color = "White";
    void sound(){
        System.out.println("Make sound");
    }
    
}

class DOG extends Animal{
    String color = "black";

    void sound(){
        System.out.println("dog bark");
    }

    void display(){
        System.out.print(super.sound());
    }
    void showColor(){
        System.out.println(color);
        System.out.println(super.color);
    }

}
public class superrrimp {
    public static void main(String[] args){
        DOG dg = new DOG();
        dg.showColor();
    }
}
