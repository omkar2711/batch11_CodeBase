public class arrayQuestion5 {
    public static void main(String[] args) {
         int arr[] = {10,11,20,21,30,31,40,41,50};
        int n = arr.length;

        int sum = 0;

        for(int i = 0;i<n;i++){
            sum += arr[i];
        }

        int avg = sum / n;
        System.out.println("The average of all the numbers is " + avg);
    }
}
