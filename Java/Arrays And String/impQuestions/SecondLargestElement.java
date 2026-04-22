public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;
        int max = 0;
        int secondMax = 0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }   
}
