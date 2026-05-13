public class factorialQuestion {
    public static int factorial(int n) { //5
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        int n = 5; 
        int result = factorial(n); //n = 5
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
