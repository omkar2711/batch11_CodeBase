public class onedimensionalarray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,}; // static declaration
        int[] arr1 = new int[5]; // dynamic declaration

        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
