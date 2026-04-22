import java.util.ArrayList;

public class ArrayListImplementation {
    public static void main(String[] args) {
        // ArrayList: ArrayList is a resizable array implementation in Java. It is part of the Java Collections Framework and provides dynamic arrays that can grow as needed. ArrayList allows us to store and manipulate a collection of objects. It provides various methods for adding, removing, and accessing elements in the list.
        // CRUD operations in ArrayList
        // - Create: We can create an ArrayList using the ArrayList class. For example, 
        // you have to import java.util.ArrayList to use ArrayList class
        ArrayList<String> list = new ArrayList<>();// creating an ArrayList of String type 

        // - Read: We can read the elements of an ArrayList using their index or by iterating through the list. For example,
        list.add("Hello");
        System.out.println("First element of the list: " + list.get(0));

        // - Update: We can update the elements of an ArrayList using their index. For example,
        list.set(0, "Hi");
        System.out.println("Updated first element of the list: " + list.get(0));

        // - Delete: We can delete elements from an ArrayList using their index or by using the remove() method. For example,
        list.remove(0);
        System.out.println("List after removing the first element: " + list);

        //Additional methods in ArrayList
        
        // - size(): This method returns the number of elements in the ArrayList. For example, int size = list.size();
        System.out.println("Size of the list: " + list.size());
        
        // - isEmpty(): This method checks if the ArrayList is empty. It returns true if the list is empty and false otherwise. For example, boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + list.isEmpty());
        
        // - clear(): This method removes all elements from the ArrayList. For example, 
        list.clear();
        System.out.println("List after clearing all elements: " + list);

    }
}
