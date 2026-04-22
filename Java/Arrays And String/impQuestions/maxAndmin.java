// Find the maximum number in an array
// Find the minimum number in an array

import java.util.Scanner;

public class maxAndmin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of The Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element Number "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("An Array Element is: ");
        for(int i:arr){
            System.out.print(i+" ");
        }

        // Finding Maximum and Minimum Element;
        int maxEle = 0;
        int minEle = arr[0];

        for(int i=0;i<n;i++){
            // if(maxEle < arr[i]){maxEle = arr[i]};
            maxEle = Math.max(maxEle, arr[i]);
        };
        for(int i=1;i<n;i++){
            // if(minEle > arr[i]){minEle = arr[i]};
            minEle = Math.min(minEle, arr[i]);
        };
        System.out.println();
        System.out.println("Minimum element is: "+minEle);
        System.out.println("Maximum element is: "+maxEle);
    }
}