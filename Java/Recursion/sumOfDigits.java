public class sumOfDigits {
    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }

        int lastDigits = n%10;
        n = n/10;
        return lastDigits + sumOfDigits(n);
    }
    public static void main(String[] args) {
        int n = 999;
        int ans = sumOfDigits(n);
        System.out.println(ans);
    }
}
