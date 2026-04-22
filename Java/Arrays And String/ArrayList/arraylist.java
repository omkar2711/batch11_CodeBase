import java.util.ArrayList;

class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Create
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // Read 
            int a = list.get(2);
            System.out.print(a);
        //  Update 
            list.set(3, 5);
        // Delete
            list.remove(1);

        for(int num:list){
            System.out.print(num);
        }
    }
}