// Variables and Data Types in Java
import java.util.Scanner;
class First {
    public static void main(String[] args){
        byte myByte = 100; // 1 byte
        short myShort = 10000; // 2 bytes
        int myInt = 100000; // 4 bytes
        long a = 10000000000L; // 8 bytes, note the 'L' at the end
        float myFloat = 3.14f; // 4 bytes, note the 'f' at the end
        double myDouble = 3.141592653589793; // 8 bytes
        char myChar = 'A'; // 2 bytes
        boolean myBoolean = true; // 1 byte

        int ch = 'H'; // char variable -> ascii value of 'B' is 66

        System.out.println(ch); // 72 - 65 = 7


        System.out.println("Byte value: " + myByte);
        System.out.println("Short value: " + myShort);
        System.out.println("int value: " + myInt);
        System.out.println("long value: " + a);
        System.out.println("float value: " + myFloat);
        System.out.println("double value: " + myDouble);
        System.out.println("char value: " + myChar);
        System.out.println("boolean value: " + myBoolean);



        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = sc.nextInt();

        System.out.println("Enter second Number");
        int num2 = sc.nextInt();

        double doubleNum = sc.nextDouble();
        char charInput = sc.next().charAt(0); // Read a single character

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        sc.close();

    }
}



