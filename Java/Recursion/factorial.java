import java.util.Scanner;

class factorial{
    public static int nthFactorial(int n){

        //Base Condition
        if(n <= 1){
            return n;
        }
        // Recursive call
        return n*nthFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = nthFactorial(n);
        System.out.println("Factorial for number "+n+" is : "+result);
    }
}