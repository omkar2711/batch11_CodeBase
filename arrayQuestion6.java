public class arrayQuestion6 {
    public static void main(String[] args) {
        int arr[] = {10,11,20,11,31,30,40,41,50};

        int n = arr.length;

        boolean isAscending = true;

        for(int i = 0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                isAscending = false;
                break;
            }
        }

        if(isAscending){
            System.out.println("Yes the array is sorted in ascending order");
        }
        else{
            System.out.println("Array is not sorted in ascending order");
        }
    }
}
