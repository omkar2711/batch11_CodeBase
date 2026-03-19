class Shape {
    public void area(){
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape {
   
}


public class polymorphismImp2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
    }
}
