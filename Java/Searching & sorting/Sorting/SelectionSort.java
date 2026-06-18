import java.util.Scanner;

class SelectionSort{
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0;i < n; i++){
            int mid_idx = i;
            for(int j = i+1;j < n;j++){
                if(arr[j] < arr[mid_idx]){
                    mid_idx = j;
                }
            }
            int temp = arr[mid_idx];
            arr[mid_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        for(int nums: arr){
            System.out.print(nums+" ");
        }
    }
}