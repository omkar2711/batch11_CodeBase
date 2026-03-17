
class Car {
    //Attributes
    String color;
    String model;
    int year;

    //Default Constructor / Non-Parameterized Constructor
    Car(){
        this.color = "white";
        this.model = "maruti";
        this.year = 2026;
    }

    //Parameterized constructor
    Car(String c, String m, int y){
        this.color = c;
        this.model = m;
        this.year = y;
    }

    Car(String c){
        this.color = c;
        // this.model = "maruti";
        // this.year = 2026;
    }

    Car(String c, String m){
        this.color = c;
        this.model = m;
        this.year = 2025;
    }

    //Copy Constructor
    Car(Car c){
        this.color = c.color;
        this.model = c.model;
        this.year = c.year;
    }

    //Method
    public void display(){
        System.out.println("Info about the car");
        System.out.println("Car color: " + this.color);
        System.out.println("Car model: " + this.model);
        System.out.println("Car year: " + this.year);
    }
}




public class oop1 {
    public static void main(String[] args) {
        //Creating the object
        Car myCar1 = new Car("Red", "BMW", 2024);
        // myCar1.display();

        Car myCar2 = new Car();
        System.out.println(myCar2.color);

        Car myCar3 = new Car("black", "tata", 2025);
        // System.out.println(myCar3.color);

        Car myCar4 = new Car(myCar1);

        Car myCar5 = new Car("blue", "audi", 2023);
        // System.out.println(myCar5.color);

    }
}
