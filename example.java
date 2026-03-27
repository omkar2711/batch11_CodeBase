abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void sound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}


class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}


class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }
}
//Properties of Abstract Class
//1. An abstract class cannot be instantiated, which means you cannot create an object of an abstract class.
//2. An abstract class can have abstract methods (methods without a body) and concrete methods (methods with a body).
//3. An abstract class can have constructors, which can be called when a subclass is instantiated.
//4. An abstract class can have member variables and static methods.



public class example {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        dog.eat();
        dog.sleep();

        cat.sound();
        cat.eat();
        cat.sleep();
    }
}
