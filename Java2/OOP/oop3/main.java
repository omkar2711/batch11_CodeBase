// Contructor
// Types of Contructor 
// -Default Constructor
// -Parameterized constructor

// int a; declaration
// a = 10; initialization
class Car{
    String color;
    String model;
    int year;

    // Default Constructor / Non-parameterized Constructor
    Car(){
        this.color = "White";
        this.model = "Maruti";
        this.year = 2015;

    }
    // Parameterized Constructor 
    Car(String c,String m,int year){
        this.color = c;
        this.model = m;
        this.year = year;
    }
    // copy constructor
    Car(Car c){
        this.color = c.color;
        this.model = c.model;
        this.year = c.year;
    }

    public void display(){
        System.out.println("Info About The Car: ");
        System.out.println("Car Color is: "+this.color);
        System.out.println("Car model is: "+this.model);
        System.out.println("Car year is: "+this.year);
    }
}
public class main {
    public static void main(String[] args) {

        Car myCar = new Car("RED","BMW",2016);
        myCar.display();

        Car myCar2 = new Car();
    }
}
