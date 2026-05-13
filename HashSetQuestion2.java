import java.util.*;
public class HashSetQuestion2 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {4,5,6,7,8,9};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            set.add(num);
        }

        System.out.println(set);

        //output union of two arrays

    }
}
