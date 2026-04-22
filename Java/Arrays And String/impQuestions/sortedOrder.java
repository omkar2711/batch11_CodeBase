public class sortedOrder {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4};
        int n = arr.length;
        int flag = 0;

        for(int i=1;i<n;i++){
            if(arr[i-1] < arr[i]){
                flag = 1;
            }else{
                flag = 0;
                break;
            }
        }

        if(flag == 1){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
