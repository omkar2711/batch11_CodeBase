class Student {

    String name;
    int id;
    int age;

    Student(String n, int i, int a){
        this.name = n;
        this.id = i;
        this.age = a;
    }

    void displayInformation(String name, int id, int age){
        System.out.println("Student Information: ");
        System.out.println("Name: " + name  );
        System.out.println("Id: " + id  );
        System.out.println("age: " + age  );
    }

    void displayInformation(String name){
        System.out.println("Student Information: ");
        System.out.println("Name: " + name  );
    }

    void displayInformation(String name, int id){
        System.out.println("Student Information: ");
        System.out.println("Name: " + name  );
        System.out.println("Id: " + id  );
    }

}


public class polymorphismImp {
    public static void main(String[] args) {
        Student s1 = new Student("Vedant", 001,23);
        s1.displayInformation(s1.name, s1.id,s1.age);
        s1.displayInformation(s1.name);
        s1.displayInformation(s1.name, s1.id);
    }
}
