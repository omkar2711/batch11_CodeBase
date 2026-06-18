import java.util.HashSet;

public class hashSetImp {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("banana");
        set.add("mango");
        set.add("grapes");
        set.add("Apple");
        
        System.out.println(set);
        System.out.println(set.contains("Apple"));
        set.remove("Apple");
        System.out.println(set);
    }
    
}
