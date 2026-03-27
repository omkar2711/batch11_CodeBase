import java.util.ArrayList;

public class arrayListImp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

  


        System.out.println(list.size());
        System.out.println(list);

        //Create
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);



        //update
        list.set(0,100);

       System.out.println(list.get(0));

        //Delete
        list.remove(0);
        System.out.println(list.get(0));

         //Read
        int ele = list.get(0);


        int n = list.size();
        for(int i = 0;i<n;i++){
            System.out.print(list.get(i) + " ");
         }
         System.out.println();

         for(int num : list){
            System.out.print(num + " ");
         }


        
    }
}
