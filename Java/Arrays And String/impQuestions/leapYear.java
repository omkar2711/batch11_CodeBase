public class leapYear {
    public static void main(String[] args) {
        int x = 1800;
        if((x % 4 == 0 && x%100 != 0) || (x%400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Its not a leap Year");
        }
    }
}
