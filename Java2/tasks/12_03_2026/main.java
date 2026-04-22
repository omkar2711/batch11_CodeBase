import java.util.Scanner;
public class main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Name: ");
    String name = sc.next();

    System.out.print("Enter Your age: ");
    int age = sc.nextInt();

    System.out.print("Enter Your City: ");
    String city = sc.next();
    
    System.out.print("Enter Your two Numbers: ");
    System.out.print("num1: ");
    int num1 = sc.nextInt();
    System.out.print("num2: ");
    int num2 = sc.nextInt();

    System.out.print("Enter Your Favorite Programming Language ");
    String Pl = sc.next();
    System.out.println("Name: "+ name);
    System.out.println("age: "+ age);
    System.out.println("City: "+city);
    System.out.println("The Two Numbers Are "+ num1 + " And "+num2);
    System.out.println("Favorite Language is: "+Pl);   
    }
}