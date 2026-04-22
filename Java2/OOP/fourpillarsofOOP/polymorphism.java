class Student{
    String name;
    int id;
    int age;

    Student(String n,int i,int a){
        this.name = n;
        this.id = i;
        this.age = a;
    }

    void printValue(String name , int id,int age){
        System.out.println("Student Information: ");
        System.out.println("Student name is " + name);
        System.out.println("Student id is " + id);
        System.out.println("Student age is " + age);
    }
    void printValue(String name,String id){
        System.out.println("Student Information: ");
        System.out.println("Student name is: " + name);
        System.out.println("Student id is : "+ id);
    }

    void printvalue(int age){
        System.out.println("Student age is: "+age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student("Vedant",001,23);
        

        
    }
}
