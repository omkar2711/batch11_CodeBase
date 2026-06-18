import java.util.Scanner;

public class sumofNth {
    
    public static int sumofNthNumber(int n){
        if(n < 1){
            return 0;
        }
        return n += sumofNthNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = sumofNthNumber(n);
        System.out.println(result);

    }
}