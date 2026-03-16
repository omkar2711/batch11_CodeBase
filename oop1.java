class Car {
    //Attributes
    String color;
    String model;
    int year;

    //constructor
    Car(String c, String m, int y){
        this.color = c;
        this.model = m;
        this.year = y;
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

        // Car myCar2 = new Car();

        Car myCar3 = new Car("black", "tata", 2025);
        System.out.println(myCar3.color);

    }
}
