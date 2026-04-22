public class JaggedArray {
    public static void main(String[] args) {
        int jaggedArr[][] = {{1,2,3,4,5},{6,7},{8,9,10}};
        System.out.println(jaggedArr[2
            
        ].length);

        for(int i=0;i<3;i++){
            for(int j=0;j<jaggedArr[i].length;j++){
                System.out.print(jaggedArr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
