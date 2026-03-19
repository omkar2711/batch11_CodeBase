class Animal {
    protected void eat(){
        System.out.println("Eating...");
    }
}


class Dog extends Animal {
    static void bark(){
        System.out.println("Barking...");
    }
}

class cat {
    static void eat(){
        System.out.println("Eating...");
    }
}



public class AccessModifiers {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
       Dog.bark();
       cat.eat();

    }
}
