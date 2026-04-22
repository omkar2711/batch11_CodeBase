import java.util.ArrayList;

public class arraylistimp {
    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // read ArrayList
        System.out.println("at 0 index we have: "+list.get(0));

        // Update ArrayList;
        list.set(0,32);
        System.out.println("at 0th index we have: "+list.get(0));

        // Delete ArrayList;
        list.remove(0);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        
    }
}
