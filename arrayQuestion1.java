public class arrayQuestion1 {
    public static void main(String[] args){

        int sum = 0; //150
        int[] arr = {10,20,30,40,50};
        //           0, 1, 2, 3, 4 , 5

        for(int i = 0;i<arr.length;i++){ //i = 5
            sum += arr[i]; // sum + arr[i];
        }

        System.out.println("Sum of all elements in the array is: " + sum);
    }
}
