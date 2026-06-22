package batch11_CodeBase;
import java.util.*;
public class SumToN {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter N: ");50
       int n = sc.nextInt();
       int sum = 0;
       for(int i = 1;i<= n;i++){
        sum = sum +i;
       }
       System.out.println("sum is " +sum); 
    }
}
