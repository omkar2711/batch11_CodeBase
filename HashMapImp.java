import java.util.*;

public class HashMapImp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();


        //adding elements into hashmap
        //put
        map.put("Apple", 280);
        map.put("banana", 280);
        map.put("Mango", 200);


        

        //updating elements 
        map.put("Apple", 220);

        

        //get : get the actual value against key
        System.out.println(map.get("Apple"));

        //containsKey : check if the key is present in the hashamp
        System.out.println(map.containsKey("Apple"));
        System.out.println("before: " + map.getOrDefault("Apple", 200));

        //remove : removes the key value pair from the hashmap
        map.remove("Apple");

        System.out.println("After : " + map.getOrDefault("Apple", 200));

        // System.out.println(map);

        // for (String f : map.keySet()) {
        //     System.out.println( f + " " + map.get(f));
        // }

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            String key = en.getKey();
            Integer val = en.getValue();
            System.out.println(key + " " + val);
        }

    }
}
