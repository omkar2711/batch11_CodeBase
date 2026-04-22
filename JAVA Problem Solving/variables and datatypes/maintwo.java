import java.util.Scanner;

public class maintwo {
    public static void main(String[] args) {
        // You're developing a simple student information system in Java. Your program should allow users to input and store information about students, including their names, ages, grades, and favorite subjects. Design the program and declare the necessary variables to implement this functionality.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Your Name");
        String Name = sc.next();
        System.out.println("Enter "+Name+" Age");
        int age = sc.nextInt();
        System.out.println("Enter "+Name+" Grade");
        char grade = sc.next().charAt(0);

        System.out.println("Student Name is :"+Name);
        System.out.println("Student age is :"+age);
        System.out.println("Student grade is :"+grade);
    }
}
