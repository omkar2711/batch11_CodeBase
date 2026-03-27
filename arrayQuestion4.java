

public class arrayQuestion4 {
    public static void main(String[] args) {
        int arr[] = {12, 4, 15, 67, 23, 14};
        int n = arr.length;

        //arr[i] = 23;
        int largest = arr[0]; // 67
        int secLargest = arr[0]; // 23


        for(int i = 0;i<n;i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }

        }

        System.out.println("Second largest element is: " + secLargest);
    }
}
