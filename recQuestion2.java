public class recQuestion2 {

    static int SumOfDigits(int n){

        if(n == 0){
            return 0;
        }
        int lastDigit = n % 10;
        n = n / 10;
        return lastDigit + SumOfDigits(n);
    }
    public static void main(String[] args) {
        int n = 1024;
        int ans = SumOfDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + ans);
    }
}
