import java.util.Scanner;

public class first {
    public static void main(String[] args){
        // DataTypes
        byte myByte = 100;
        short myShort = 10000;
        int myInt = 10000000;
        float myFloat = 3.14f;
        long myLong = 100000000000L;
        double myDouble = 3.14444444444444;
        char myChar = 'A';
        boolean myBoolean = true;
        char ch = 'H';

        System.out.println("Byte Value "+myByte);
        System.out.println("Short Value "+myShort);
        System.out.println("Int value "+myInt);
        System.out.println("Float value " + myFloat);
        System.out.println("Long value " + myLong);
        System.out.println("Double Value " + myDouble);
        System.out.println("Double value " + myChar);
        System.out.println("Boolean value " + myBoolean);
        System.out.println("character value " + ch);

        // Scanner 
        Scanner sc = new Scanner(System.in);
        System.out.println("First Number: ");
        int one = sc.nextInt();
        System.out.println("Second Number: ");
        int two = sc.nextInt();
        int add = one + two;
        System.out.println("Sum of num1: " + one + " And num2: " + two + " is " + add);

        sc.close();
        
    }
}
