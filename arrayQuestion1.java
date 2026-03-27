public class arrayQuestion1 {
    public static void main(String[] args){


       int arr[] = {12, 4, 15, 67, 23, 14};  //Static array declaration and initialization

       boolean found = false;
       for(int i = 0;i<arr.length;i++){ //i = 0
            if(arr[i] == 60){
                found = true;
                break;
            }
       }

       if(found){
        System.out.println("Element found in the array");
       }
       else{
        System.out.println("Element not found in the array");
       }


       arr[0] = 23; // Update element at index 0 to 23
       int arr2[] = new int[5]; // Dynamic array declaration
       arr2[0] = 10;
       arr2[1] = 20;
      

    //    System.out.println(arr2[3]);


       int arr3[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
       };

       arr3[1][1] = 15;
 


       for(int i = 0;i<arr3.length;i++){
        for(int j = 0;j<arr3[i].length;j++){
            // System.out.print(arr3[i][j] + " ");
        }
        // System.out.println();
       }
       int arr4[][][] = new int[2][3][4];

       int arr5[][][][][] = new int[2][3][4][5][6];



       int jaggedArr[][] = {
        {1, 2, 3},
        {4, 5},
        {6, 7, 8, 9}
       };





        arr2[2] = 30;
       arr2[3] = 40;
       arr2[4] = 50;
    }
}
