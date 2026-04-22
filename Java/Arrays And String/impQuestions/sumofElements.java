// Calculate the sum of all elements in an array

import java.util.Scanner;

public class sumofElements {
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

        //writing sum logic here
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Total Sum of array is: "+sum);

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int matrixSum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                matrixSum += matrix[i][j];
            }
        }
        System.out.println("Matrix Sum is: "+matrixSum);
    }
}
