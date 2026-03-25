



class Shape {

    public Shape() {
        System.out.println("Shape constructor called");
    }
    
    public void area(){
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape {

    Triangle(){
          super();
    }
    @Override
    public void area(){
        System.out.println("Area of triangle");
    }
}


public class polymorphismImp2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
    }
}
