public class arrayReverse {



    public static void printArray(int[] arr, int n){
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = {10,11,20,21,30,31,40,41,50};
        int n = arr.length;

        System.out.println("Array before: ");
        printArray(arr, n);


        for(int i = 0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        System.out.println("Array after: ");
        printArray(arr, n);
    }
}
