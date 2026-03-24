public class twodimensional {
    public static void main(String[] args) {
        // int arr[][] = new int[5][5];
        // int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][][] arr3 = {{{1,2,3},{4,5,6},{7,8,9}}, {{10,11,12},{13,14,15},{16,17,18}}, {{19,20,21},{22,23,24},{25,26,27}}};

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         for(int z = 0;z<3;z++){
        //             System.out.print(arr3[i][j][z]+" ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

        int jaggedArr[][] = {
            {1,2,3,4,5},{6,7},{8,9,10}
        };

        for(int i=0;i<3;i++){
            for(int j=0;j<jaggedArr[i].length;j++){
                System.out.print(jaggedArr[i][j]+" ");
            }
            System.out.println();
        }


        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
