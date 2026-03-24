public class arrayImplementation {
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50}; // Static array

        int[] arr2 = new int[5]; // Dynamic array

        arr2[0] = 50;
        arr2[1] = 40;
        arr2[2] = 30;
        arr2[3] = 20;
        arr2[4] = 10;


        //Searching element in the array
        int target = 70;
        boolean flag = false;

        for(int i = 0;i< arr.length;i++){
            if(arr[i] == target){
                flag = true;
            }
        }

        if(flag == true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }

        String[] studentNames = {"Madhusudan", "Sanjana", "Laxmi", "Pranshu", "Vedant"};

        int n = studentNames.length; //5


        // for(int i = 0;i<n;i++){
        //     System.out.println(studentNames[i] + " ");
        // }
    }
}
