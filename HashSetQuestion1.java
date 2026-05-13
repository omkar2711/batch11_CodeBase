import java.util.*;
public class HashSetQuestion1 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,5,3,5,6,4,6,4};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<n;i++){
            set.add(arr[i]);
        }


        System.out.println(set);
    }
}
