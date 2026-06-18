import java.util.Scanner;

public class power {
    public static int isPower(int a,int b){
        if( b == 0){
            return 1;
        }
        return a * isPower(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = isPower(a,b);
        System.out.println(result);
    }    
}
