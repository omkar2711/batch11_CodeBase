public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;

        int target = 77;
        int index = -1;

        for(int i = 0 ;i<n;i++){
            if(arr[i] == target){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at : " + index);
        }
    }
}
