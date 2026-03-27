class employee {

    //Attributes
    private String name;
    private int age;
    //Methods
    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setName(String n){
        this.name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        this.age = a;
    }

}
public class EncalsulationImp {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setName("Paras");
        e1.setAge(25);

        // e1.name = "Paras"; // This will give an error because name is private

        System.out.println(e1.getName());
        System.out.println(e1.getAge());
    }
}
