public class replacenegative {
    public static void main(String[] args) {
        int[] arr = {-10,-20,20,30,40,50};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
