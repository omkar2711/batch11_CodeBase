// 17. Count the number of elements divisible by 3 and by 5.
public class countElemendivisible {
    public static void main(String[] args) {
        int[] arr = {15, 9, 10, 7, 30, 18, 25, 4};
        int n = arr.length;
        int count3 = 0;
        int count5 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] % 3 == 0){
                count3++;
            }
            else if(arr[i] % 5 == 0){
                count5++;
            }
        }
        System.out.println("Total Count of Numbers divisible by 3 is: "+count3);
        System.out.println("Total Count of Numbers divisible by  5 is: "+count5);

    } 
}
