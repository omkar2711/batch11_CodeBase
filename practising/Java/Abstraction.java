abstract class animal{
    public abstract void sound();
    public void sleep(){
        System.out.println("Animal sleeps");
    }
}
class Dog extends animal{
    @Override
    public void sound(){
        System.out.println("Bhau bhau");
    }
    public void eat(){
        System.out.println("Dog Eats Pedigree");
    }
}
class Cat extends animal{
    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }
    public void eat(){
        System.out.println("Cat eat cat_food");
    }
}
// Properties of Abstract Class 
//1. An abstract class cannot be instantiated, which means you cannot create an object of an abstract class. 
//2. An abstract class can have abstract methods (methods without a body) and concrete methods (methods with a body). 
// //3. An abstract class can have constructors, which can be called when a subclass is instantiated. 
// //4. An abstract class can have member variables and static methods.



public class Abstraction {
    public static void main(String[] args) {
        Dog dg = new Dog();
        Cat ct = new Cat();
        dg.sound();
        dg.eat();
        dg.sleep();
        System.out.println(" ");
        ct.sound();
        ct.eat();
        ct.sleep();
    }
}