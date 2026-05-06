public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;

        int target = 70;

        int left = 0;
        int right = n - 1;

        while(left <= right){
            int mid = (left) + (right - left)/2;

            if(arr[mid] == target){
                System.out.println("Element found at index " + mid);
                break;
            }
            else if(target > arr[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
    }
}
