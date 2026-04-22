import java.util.Scanner;

public class countnumberappearance {
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
        System.out.println("Enter to find the value is present of not");
        int x = sc.nextInt();

        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }

        if(count > 0){
            System.out.println("Value it Present in an array. The number of element appear is: "+ count);
        }
        else{
            System.out.println("Value is not present in an array");
        }
    }
}
