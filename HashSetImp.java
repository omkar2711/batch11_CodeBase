import java.util.HashSet;

public class HashSetImp {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("banana");
        set.add("Mango");

        System.out.println(set);

        System.out.println(set.contains("Apple")); //O(1)

        set.remove("Apple");

        System.out.println(set);


    }
}
