public class arrayQuestion9 {
    public static void main(String[] args) {
        int num1[] = {1,2,3,4,5,6,7};
        int n = num1.length;
        int num2[] = {4,5,6,7,8,9}; //4,5,6,7
        int m = num2.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(num1[i] == num2[j]){
                    System.out.print(num1[i] + " ");
                    break;
                }
            }
        }
    }
}
