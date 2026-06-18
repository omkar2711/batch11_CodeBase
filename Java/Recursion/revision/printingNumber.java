import java.util.Scanner;

class printingNumber{
    public static void PrintingNumbertillN(int s,int n){
        if(s > n){
            return;
        }
        System.out.print(s+" ");
        PrintingNumbertillN(s+1,n);
    }
    public static void ReeverseNumber(int s,int n){
         if(s < n){
            return;
         }
         System.out.println(s+"");
         s--;
         ReeverseNumber(s, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        // PrintingNumbertillN(s,n);
        // ReeverseNumber(s, n);
    }
}