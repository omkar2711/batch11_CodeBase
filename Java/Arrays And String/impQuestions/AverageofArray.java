// Calculate the average of elements in an array

import java.util.Scanner;

public class AverageofArray {
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

        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        int average = sum / n;
        float average2 = sum / n;
        System.out.println("The Sum of the array is: "+sum);
        System.out.println("The Average Of the Array is: "+average2);
    }
}
