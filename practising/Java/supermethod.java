class Animal{
        public Animal(){
            System.out.println("Animal Constructor called");
        }
}
class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog Construct id called");
    }
}

public class supermethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        
    }
}
