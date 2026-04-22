import java.util.Scanner;

public class main{
    static void numberPrint(int s,int e){
        for(int i=s;i<=e;i++){
            System.out.println(i);
        }
    }
    static void backwardPrint(int s,int e){
        for(int i=s;i>=e;i--){
            System.out.println(i);
        }
    }
    static void evenPrint(int s,int e){
        for(int i=s;i<=e;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
    static void oddPrint(int s,int e){
        for(int i=s;i<=e;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
    static void sumofnumberPrint(int s,int e){
        int sum = 0;
        for(int i=s;i<=e;i++){
            sum += i;
        }
        System.out.println("Sum =c"+sum);
    }

    static void tablePrint(int s,int e){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table of: ");
        int n = sc.nextInt();
        for(int i=s;i<=e;i++){
            System.out.println(i * n);
        }
    }
    // static void pattern(int s,int e){
    //         for(int i=s;i<e;i++){

    //     }
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select any one");
        System.out.println("1:Print numbers from s to e using for loop.");
        System.out.println("2:Print numbers from e to s using loop.");
        System.out.println("3:Print even numbers from 1 to 20.");
        System.out.println("4:Print odd numbers from 1 to 20.");
        System.out.println("5: Find sum of numbers from 1 to N.");
        System.out.println("6: Print multiplication table of a number.");

        System.out.println("Select any number from above list: ");
        int n = sc.nextInt();

        System.out.print("Enter Your starting number");
        int s = sc.nextInt();
        System.out.print("Enter Your end Number");
        int e = sc.nextInt();

        if(n == 1){
            numberPrint(s, e);
        }
        else if(n==2){
            backwardPrint(s, e);
        }
        else if(n==3){
            evenPrint(s, e);
        }
        else if(n==4){
            oddPrint(s, e);
        }
        else if(n==5){
            sumofnumberPrint(s, e);
        }
        else if(n==6){
            tablePrint(s, e);
        }
    }
}