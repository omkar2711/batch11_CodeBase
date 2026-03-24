class a{
    void display(){
        System.out.println("class a");
    }
}
class b extends a{
    void display1(){
        System.out.println("class b extending class a with all properties of class a");
    }
}

class SingleLevel{
    public static void main(String[] args) {
        b be = new b();
        be.display();
        be.display1();
    }
}