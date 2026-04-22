import java.util.LinkedList;
public class LinkedListImp2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();


        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        list.addFirst(5);
        list.addFirst(2);

        list.add(4, 25);
        list.removeLast();
        list.removeFirst();
        list.remove(3);
        
        System.out.println(list);

    }
}
