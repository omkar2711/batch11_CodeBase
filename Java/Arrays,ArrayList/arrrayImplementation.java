import java.util.Scanner;

public class arrrayImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount to store in array");
        int n = sc.nextInt();
        //Array: An array is a data structure that can hold a fixed number of values of the same type. It is a collection of elements that are stored in contiguous memory locations. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value. In Java, arrays are objects that can be created using the 'new' keyword or by initializing them with values.

        //In Array there are two types of declaration which are 
            // - dynamic declaration: dynamic declaration is when we declare an array with a variable size which is determined at runtime. We can use the 'new' keyword to create an array of a specific size. For example, int arr[] = new int[n]; where n is the size of the array determined at runtime.
            // - static declaration: static declaration is when we declare an array with a fixed size at the time of declaration. For example, int arr[] = {1, 2, 3, 4, 5};
            
            //CRUD operations in array
            // - Create: We can create an array using the 'new' keyword or by initializing it with values. For example, int arr[] = new int[5]; or int arr[] = {1, 2, 3, 4, 5}; 
            int arr1[] = new int[n]; // dynamic declaration
            int arr2[] = {1, 2, 3, 4, 5}; // static declaration

            // - Read: We can read the elements of an array using their index. For example, int value = arr[0]; 
            System.out.println("First element of arr1: " + arr1[0]); // default value is 0
            System.out.println("First element of arr2: " + arr2[0]); // output will be 1 as we have initialized the array with values
            
            // - Update: We can update the elements of an array using their index. For example, arr[0] = 10; 
            arr1[0] = 10;
            arr2[0] = 100;
            System.out.println("Updated element of arr1: " + arr1[0]);
            System.out.println("Updated element of arr2: " + arr2[0]);

            // - Delete: We cannot delete elements from an array in Java. We can only set the element to a default value or use a different data structure.
            arr1[0] = 0; // setting the element to default value
            arr2[0] = 0; // setting the element to default value
            System.out.println("Deleted element of arr1: " + arr1[0]);
            System.out.println("Deleted element of arr2: " + arr2[0]);
    }
}
