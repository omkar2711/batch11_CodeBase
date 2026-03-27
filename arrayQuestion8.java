public class arrayQuestion8 {
    public static void main(String[] args) {
        int arr[] = {10,11,20,21,30,31,40,41,50};
        int n = arr.length;

        int evenCount = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
        }

        int newArr[] = new int[evenCount];

        int j = 0;
        for(int i = 0;i<n;i++){
           if(arr[i] % 2 == 0){
                newArr[j] = arr[i];
                j++;
            }
        }

        System.out.println("new array with even numbers");
        for(int i = 0;i<evenCount;i++){
            System.out.print(newArr[i] + " ");
        }
    }
}
