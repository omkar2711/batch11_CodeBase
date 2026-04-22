class car{
    // Attributes
    String color;
    String model;
    int year;

    // constructor
    car(String c,String m,int year){
        this.color = c;
        this.model = m;
        this.year = year;
    }

    // Methods
    public void display(){
        System.out.println("Info About the car: ");
        System.out.println("car color: "+this.color);
        System.out.println("car model: "+this.model);
        System.out.println("car year: "+this.year);

    }
}

public class main{
    public static void main(String[] args){
        // Creating The object
        car myCar1 = new car("Red","BMW",2024);
        myCar1.display();
        car myCar2 = new car("Black","TATA",2026);
        myCar1.display();

        // Adding Propertiest to the Object
        // myCar1.color = "Red";
        // myCar1.model = "BMW";
        // myCar1.year = 2014;
        // myCar1.display();

        // car myCar2 = new car();
        // myCar2.color = "Black";
        // myCar2.model = "TATA";
        // myCar2.year = 2025;
        // myCar2.display();




    }
}