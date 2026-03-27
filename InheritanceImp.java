class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Triangle extends Shape {
    void area(){
        System.out.println("Area of triangle");
    }
}

class Circle extends Shape {
    void area(){
        System.out.println("Area of circle");
    }
}

// class EqualateralTriangle extends Triangle {
//     void area(){
//         System.out.println("Area of equilateral triangle");
//     }
// }







public class InheritanceImp{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
    }
}