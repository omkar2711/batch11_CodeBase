// Count how many even and odd numbers are in the array

import java.util.Scanner;

public class findEventandOdd {
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

        int countEven = 0;
        int countOdd = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        
        System.out.println();
        System.out.println("Even Count in an Array is: "+countEven);
        System.out.println("Odd Count in an Array is: "+countOdd);
    }
}
