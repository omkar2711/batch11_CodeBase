


public class RecursionImp1 {

    static void printNumber(int n){
        if( n > 5){ //base case
            return;
        }
        System.out.println(n);
        n++;
        printNumber(n); //recursive call
    }
    public static void main(String[] args) {
        printNumber(1);
    }
}
