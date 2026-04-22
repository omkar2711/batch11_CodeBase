// SIngle Level Inheritence

// class Animals{
//     int legs;
    
//     public void eating(){
//         System.out.println("Eating .....");
//     }
// }
// class Dog extends Animals{
//     String name;
//     void bark(){
//         System.out.println("My Dog name is "+name);
//         System.out.println("There are "+ this.legs+" legs");
//         System.out.println("Make Sounds like Bhow Bhow");
//     }
// }

// Multilevel Inheritance
class shape{
    void area(){
        System.out.println("Area Of  shape");
    }
}

class Triangle extends shape {
    void area(){
        System.out.println("Area of Triangle");
    }
}

class EqTriangle extends Triangle{
    void area(){
        System.out.println("Area of EQTrraingle");
    }
}

public class inheitance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.legs = 4;
        myDog.bark();

    }
}
