public class diffMaxandMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int maxEle = 0;
        int minEle = arr[0];
        for(int i=0;i<n;i++){
            maxEle = Math.max(arr[i],maxEle);
            minEle = Math.min(arr[i],minEle);
        }
        System.out.println("Differnce of both min and max are: "+(maxEle-minEle));
    }
}
