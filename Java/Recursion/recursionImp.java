public class recursionImp {
    static void printNumber(int n){
        if(n >= 5){  //base condition
            return;
        }

        printNumber(++n);
        System.out.print(n+" "); //Recursive Call
    }
    public static void main(String[] args) {
        printNumber(0);
    }
}
