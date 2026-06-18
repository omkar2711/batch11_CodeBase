import java.util.HashSet;

public class hashsetquestion {
    public static void main(String[] args) {
        // int arr[] = {1,2,2,3,4,5,3,5,6,4,6,4};
        // HashSet<Integer> set = new HashSet<>();
        // int n = arr.length;
        // for(int i = 0;i<n;i++){
        //     set.add(arr[i]);
        // }

        // System.out.println(set);
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7,8};

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i = 0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println(set);
    
    }
    
}
