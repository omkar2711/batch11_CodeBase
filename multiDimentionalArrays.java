public class multiDimentionalArrays {
    public static void main(String[] args) {
        


        int arr[][][] ={{{1,2},{4,5},{7,8}},
                    {{10,11},{12,13},{14,15}},
                    {{16,17},{18,19},{20,21}}};


        int arr2[][] = {
            {1,2,3,4},
            {2,3,4,5},
            {4,5,6,7}
        };
        System.out.println(arr2[2][2]);


        int jaggedArr[][] = {
            {1,2,3,4,5},
            {6,7},
            {8,9,10}
        }; 

        // for(int i = 0;i<3;i++){
        //     for(int j = 0;j<jaggedArr[i].length;j++){
        //         System.out.print(jaggedArr[i][j] + " ");
        //     }
        //     System.out.println();
        // }




       
    }
}
