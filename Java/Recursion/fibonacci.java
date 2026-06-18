public class fibonacci {
    static int printfibo(int n){
        if(n == 1 || n==0){
            return n;
        }
        return printfibo(n-1) + printfibo(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        int r = printfibo(n);
        System.out.println(r);
    }
}