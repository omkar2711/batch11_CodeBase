import java.util.Scanner;
public class arrayTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String StudentName[] = {"madhusudhan","Sanjana","Laxmi","Pranshu","Vedant"};

        String[] StudentsNames = new String[5];
        
        StudentsNames[0] = "madhusudhan";
        StudentsNames[1] = "Sanjana";
        StudentsNames[2] = "Laxmi";
        StudentsNames[3] = "Pranshu";
        StudentsNames[4] = "Vedant";

        int n = StudentsNames.length;

        for(int i=0;i<n;i++){
            System.out.println("Enter Student "+i);
            StudentsNames[i] = sc.next();
        }

        for(int i=0;i<n;i++){
            System.out.println("students "+ (i+1) + " Name is: " + StudentsNames[i]);
        }

        // for(int i=0;i<StudentName.length;i++){
        //     System.out.println(StudentName[i]);
        // }

        // int arr1[] = {10,20,30,40,50}; 
        // int[] arr = new int[5];

        // System.out.println(arr1[0]);
    }
}