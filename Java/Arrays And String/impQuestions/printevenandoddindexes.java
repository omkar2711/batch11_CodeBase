public class printevenandoddindexes {

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        System.out.println("Even Index elements: ");
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd Index elements: ");
        for(int i=0;i<arr.length;i++){
            if(i%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}