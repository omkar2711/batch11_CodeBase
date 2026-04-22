// Check if all elements in an array are positive.

public class allElements {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,-2};
        int n = arr.length;
        boolean flag = true;

        for(int i=0;i<n;i++){
            if(arr[i]<0){
                flag = false;
            }
        }
        if(flag == false){
            System.out.println("There is an negative element in array");
        }else{
            System.out.println("There is not any negative Element");
        }
    }
}
