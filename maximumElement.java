
import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            System.out.println("Enter element number " + (i+1) );
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        for(int i = 0;i<n;i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();

        int maxEle = arr[0];

        int minEle = arr[0];

        // for(int i = 0;i<arr.length;i++){
        //     if(maxEle < arr[i]){
        //         maxEle = arr[i];
        //     }

        //     if(minEle > arr[i]){
        //         minEle = arr[i];
        //     }
        // }

        for(int i = 0;i<arr.length;i++){
            maxEle = Math.max(arr[i], maxEle);
            minEle = Math.min(arr[i] , minEle);
        }

        System.out.println("Maximum element in the array is: " + maxEle);
        System.out.println("Minimum element in the array is: " + minEle);
    }
}
