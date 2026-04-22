import java.util.Scanner;
// 40. Create a class Student with properties and methods.
// class students{
//     public void name(String Name){
//         System.out.println("Name of the student is: "+Name);
//     }
//     public void age(int age){
//         System.out.println("Age of student is: "+age);
//     }
// }


// 41. Demonstrate inheritance using a base class Animal.

// 42. Write a program demonstrating method overloading.

// 43. Write a program demonstrating method overriding.

// 44. Create an interface and implement it in a class.

// 45. Demonstrate encapsulation using getters and setters.
class encap{
    private String name;
    private int salary;

    public void setName(String n){
        this.name = n;
    }
    
    public void getName(){
        System.out.println("this is the name: "+name);
    }
    public void setSalary(int s){
        this.salary = s;
    }
    public void getSalary(){
        System.out.println("Salary of account holder is: "+salary);
    }

}

public class answers {
    public static void main(String[] args) {
        encap en = new encap();
        en.setName("vedant");
        en.setSalary(1000000);
        en.getName();
        en.getSalary();
//Q31) Write a Java program to check if a number is even or odd.
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Number to check if it is even or not");
        // System.out.println("Enter Number to print till N");
        // int x = sc.nextInt();

        // if(x%2 == 0){
        //     System.out.println("Is Even Number ");
        // }else{
        //     System.out.println("Is odd Number");
        // }

//Q32) Write a Java program to print numbers from 1 to N.
    // for(int i=1;i<=x;i++){
    //     System.out.print(i+" ");
    // }

// 33. Write a Java program to find the largest of three numbers.
        // System.out.println("Enter Number 1");
        // int num1 = sc.nextInt();
        // System.out.println("Enter Number 2");
        // int num2 = sc.nextInt();
        // System.out.println("Enter Number 3");
        //     int num3 = sc.nextInt();

        //     int max = Math.max(num1,num2);
        //     int maxEle = Math.max(max,num3);

        //     System.out.println(maxEle+" is The Maximum among all");


// 34. Write a Java program to print the multiplication table of a number.
// System.out.println("Table of What number: ");
//     int n = sc.nextInt();
//     for(int i =1;i<=10;i++){
//         System.out.println(n+" X "+i+" = "+i*n);
//     }

// 35. Write a Java program to reverse a number.
    // int n = sc.nextInt();
    // int res = 0;
    // while(n > 0){
    //     res = n%10 + res*10;
    //     n = n/10;
    // }
    // System.out.println(res);

// 36. Write a Java program to check if a number is prime.
    // int n = sc.nextInt();
    // if(n<=1){
    //     System.out.println("is not a prime number");
    //     return;
    // }
    // for(int i=2;i*i<=n;i++){
    //     if(n%i == 0){
    //         System.out.println("is not a prime");
    //         return;
    //     }
    // }
    // System.out.println("is a prime");


// 37. Write a Java program to print the Fibonacci series.
// int n = sc.nextInt();    
// int a = 0;
//     int b = 1;
//     int next;
//     for(int i=1;i<n;i++){
//         next = a+b;
//         a = b;
//         b = next;
//     }
//     System.out.println(b);
// 38. Write a Java program to find the factorial of a number.
// int n = sc.nextInt();
// int fact=1;
// for(int i=1;i<=n;i++){
//     fact *= i;
// }
// System.out.println(fact);

// 39. Write a Java program to check whether a number is a palindrome.
        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // int original = num;
        // int reversed = 0;

        // while (num != 0) {
        //     int digit = num % 10;
        //     reversed = reversed * 10 + digit;
        //     num = num / 10;
        // }

        // if (original == reversed) {
        //     System.out.println("Palindrome Number");
        // } else {
        //     System.out.println("Not a Palindrome Number");
        // }

        // objext calliing 
        // students st = new students();
        // st.name("vedant");
        // st.age(22);
    }
}
