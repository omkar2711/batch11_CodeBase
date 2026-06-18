import java.util.Scanner;

public class factorial {
    static int printNthFactorial(int n){
        if(n <= 1){
            return n;
        }
        return n * printNthFactorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = printNthFactorial(n);
        System.out.println(result);
    }
}
