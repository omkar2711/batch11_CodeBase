public class arrayQuestion7 {
    public static void main(String[] args) {
        int arr[] = {10,11,20,21,30,31,40,41,50};
        int n = arr.length;
        int target = 31;

        for(int i = 0;i<n;i++){
            if(arr[i] > target){
                System.out.println("The next greater element than " + target + " is " + arr[i]);
                break;
            }
        }
    }
}
