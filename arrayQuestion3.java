public class arrayQuestion3 {
    public static void main(String[] args) {
        int arr[] = {10,11,20,21,30,31,40,41,50};
        int n = arr.length;

        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0;i<n;i++){
            if(arr[i]%2 == 0){
                evenSum += arr[i];
            } 
            else{
                oddSum += arr[i];
            }
        }

        System.out.println("Even sum is " + evenSum);
        System.out.println("Odd sum is " + oddSum);

        
    }
}
