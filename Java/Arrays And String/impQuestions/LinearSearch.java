// Search for a given element (linear search)

import java.util.Scanner;

public class LinearSearch {
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
        System.out.println();
        System.out.println("Enter The Target Element you want to find here: ");
        int x = sc.nextInt();
        boolean flag = false;
        int index = 0;

        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag = true;
                index = i;
            }
        }
        if(flag == true){
            System.out.println("Element is Present in an Array at index: "+index);
        }else{
            System.out.println("Element is Not Present in Array");
        }

    }
}
