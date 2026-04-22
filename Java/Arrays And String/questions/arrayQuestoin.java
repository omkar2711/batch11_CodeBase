package questions;
public class arrayQuestoin {
    public static void main(String[] args) {
        int[] arr = {17,21,23,26,4,16,8,2,1,67,9,33,91};
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: "+max);
        System.out.println("minimum element is: "+min);
    }
}
