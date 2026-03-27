public class patternPrinting3 {
    public static void main(String[] args) {
        int num = 1;
        char ch = 'a';
        for(int i = 1;i<=5;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(ch + " ");
                
            }
            ch++;
            System.out.println();
        }
    }
}
