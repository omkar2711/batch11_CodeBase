// Given a sorted array, find the first and last position of a target element. What is the optimal time complexity?
class repitativeNumber{
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,4,5};
        int n = arr.length;
        int target = 2;
        int index[] = new int[2];

        for(int i = 0;i<n;i++){
            if(arr[i] == target){
                index[0] = i;
                break;
            }
        }
        for(int i = n-1;i>=0;i--){
            if(arr[i] == target){
                index[1] = i;
                break;
            }
        }

        for(int nums:index){
            System.out.print(nums+1 + " ");
        }
        
    }
}