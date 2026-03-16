public class switchCase {
    public static void main(String[] args) {
        
        int day = 1;

        switch(day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.err.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 : 
                System.out.println("Thur");
                break;
            case 5 : 
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid day");
                
        }
    }
}
