class Student{
    String Name;
    int age;
    Student(String n,int a){
        this.Name = n;
        this.age = a;
    }
    Student(Student s){
        this.Name = s.Name;
        this.age = s.age;
        System.out.println("Name of Student "+Name);
        System.out.println("Age of student "+age);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Student s = new Student("Kumud",22);
        Student s2 = new Student(s);
    }
}
