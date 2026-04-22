public class nextElementthangretor {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int x = 20;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
