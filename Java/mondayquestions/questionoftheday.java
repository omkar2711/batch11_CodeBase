import  java.util.Scanner;
// MCQ 
// B
// B
// B
// B
// C
// A
// C
// B
// B
// C
// OOP
// A
// A
// A
// B
// B
//Mixed Concepts
// C 
// B
// B
// B
// B

class questionoftheday{
    public static void printing(){
        for(int i = 1;i<10;i++){
            System.out.print(i+" ");
        }
    }
    public static void printingEven(){
        for(int i = 0;i<50;i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static int sumofNatural(int n){
        int sum = 0;
        for(int i = 1;i<n;i++){
            sum += i;
        }   
        return sum;
    }
    public static void multiplicationTable(int n ){
        for(int i = 1;i<10;i++){
            System.out.println(n +" X "+ i + " = "+n*i);
        }
    }

    public static void postiveOrNot(int n){
        if(n < 0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative number");
        }
    }
    public static int largestofThree(int one,int two,int three){
        int largest = Math.max(one,two);
        largest = Math.max(three,largest);
        return largest;
    }
    public static void EvenOrOdd(int n){
        if(n % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static int maximumNumber(int arr[] , int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] reverseAnArray(int arr[],int n){
        int j = n-1;
        for(int i = 0;i<n/2;i++){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
        return arr;
    }

    public static int sumOfElements(int arr[],int n){
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt(); 

    }
}