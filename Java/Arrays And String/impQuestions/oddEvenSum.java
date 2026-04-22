public class oddEvenSum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int n = arr.length;

        int evenSum = 0;
        int oddSum = 0;

        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                evenSum += arr[i];
            }
            else{
                oddSum += arr[i];
            }
        }
        System.out.println("Even Sum: "+evenSum);
        System.out.println("odd Sum: "+oddSum);

    }
}
