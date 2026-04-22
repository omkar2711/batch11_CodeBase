package questions;
public class Searching {
    public static void main(String[] args) {
        int target = 30;
        int[] arr = {10,20,30,40,50};
        int n = arr.length;

        int flag = 0;
        for(int i=0;i<n;i++){
            if(target == arr[i]){
                flag = 1;
            }
        }

        if(flag == 1){
            System.out.println("Element found...");
        }else{
            System.out.println("element not found");
        }

    }
}
