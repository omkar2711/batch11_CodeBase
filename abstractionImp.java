// abstract class Animal {
//     // Abstract method (does not have a body)
//     public abstract void sound();

//     // Regular method
//     public void sleep() {
//         System.out.println("Zzz");
//     }
// }


// class Dog extends Animal {

//     public void sound() {
//         System.out.println("Dog barks");
//     }

//     public void eat() {
//         System.out.println("Dog is eating");
//     }
// }


// class Cat extends Animal {

//     public void sound() {
//         System.out.println("Cat meows");
//     }
//     public void eat() {
//         System.out.println("Cat is eating");
//     }
// }
// //Properties of Abstract Class
// //1. An abstract class cannot be instantiated, which means you cannot create an object of an abstract class.
// //2. An abstract class can have abstract methods (methods without a body) and concrete methods (methods with a body).
// //3. An abstract class can have constructors, which can be called when a subclass is instantiated.
// //4. An abstract class can have member variables and static methods.


// abstract class Bank {
//     abstract void deposit();
//     abstract void withdraw();
//     abstract int getBalance();
// }

// class HDFC extends Bank{
//     private int balance;

//     HDFC(int balance) {
//         this.balance = balance;
//     }
//     public void deposit(){
//         balance += 10;
//     }
//     public void withdraw(){
//         balance -= 10;
//     }
//     public int getBalance(){
//         return balance;
//     }
// }

// public class abstractionImp {
//     public static void main(String[] args) {

//         Bank user1 = new HDFC(100);
//         System.out.println(user1.getBalance());
//         user1.deposit();
//         user1.deposit();
//         user1.withdraw();
//         System.out.println(user1.getBalance());

//     }
// }
