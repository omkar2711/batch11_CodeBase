class Student {
    String Name;
    int age;
    Student(String n,int a){
        this.Name  = n;
        this.age  = a;
        System.out.println("Student Name:"+ Name);
        System.out.println("Student Age:"+ age);
    }
}

public class parameterizedConstructor {
    public static void main(String[] args) {
        Student st = new Student("Kumud",21);   
    }
}
