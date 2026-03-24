abstract class Animal{
    abstract void Eat();
    abstract void Sleep();
}

class Dog extends Animal{
    void Eat(){
        System.out.println("Dog Eats...");
    };
    void Sleep(){
        System.out.println("zzz...");
    };
    void Name(){
        System.out.println("This is Dogs");
    };
}

class abstractionimp{
    public static void main(String[] args){
        Dog dg = new Dog();
        dg.Eat();
        dg.Sleep();
        dg.Name();
    }
}