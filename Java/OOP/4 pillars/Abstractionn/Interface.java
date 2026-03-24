interface Animal{
    abstract void Eat();
    abstract void Sleep();
}

class Dog implements Animal{
    public void Eat(){
        System.out.println("Dog Can Eat");
    };
    public void Sleep(){
        System.out.println("zzz...");
    };
    public void Name(){
        System.out.println("Name of Dog is Muko");
    };
}

public class Interface {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.Name();
        dg.Eat();
        dg.Sleep();
    }
}
