// Defult Constructor
class Animal {
    void eat(){
        System.out.println("This Animals eats...");
    }
    void drink(){
        System.out.println("This animal drinks...");
    }
}

class dog extends Animal{
    dog(){
        System.out.println("I am Default Constructor inside dog class");
    }
    void sniff(){
        System.out.println("This Dogs sniffs very well..");
    }
}

public class constructor1imp {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
    }
}