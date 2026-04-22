import java.util.*;
public class Arraylistimplementation {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Numbers to add in arraylist: ");
        int n = sc.nextInt();

        // for(int i = 0;i<n;i++){
        //     System.out.println("add element numner: "+i+"in list: ");
        //     int l = sc.nextInt();
        //     list.add(l);
        // }
        //  int max = list.get(0);
        // int min = list.get(0);

        // for(int i = 0;i<n;i++){
        //     if(list.get(i) > max){
        //         max = list.get(i);
        //     }
        //     if(list.get(i) < max){
        //         min = list.get(i);
        //     }
        // }
        // System.out.println("max: "+max );
        // System.out.println("min: "+ min);

        // Reversing: 
        for(int i = 0;i<n;i++){
            list.set(list.get(i),list.get(n-i-1));
            list.set(list.get(n-i-1), list.get(i));
        }
        
        for(int i = 0;i<n;i++){
            System.out.println(list.get(i));
        }
    }
}
