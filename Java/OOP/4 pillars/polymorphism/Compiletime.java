// This is only called as method overloading
class Animal{
    void Animal(){
        System.out.println("Animal Name");
    }
    void Animal(int age){
        System.out.println("Animal Age : "+ age);
    }
    void Animal(String Name){
        System.out.println("Animal Name: "+Name);
    }
    void display(){
        System.out.println("Overloading is Writing methods multiple time in a single cclass where load get increase");
    }
}

public class Compiletime {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.Animal();
        a.Animal(22);
        a.Animal("Dog");
    }
}
