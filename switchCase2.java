import java.util.Scanner;

public class switchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        switch(number){
            case 1 :
                System.out.println("Action");
                break;
            case 2 :
                System.out.println("Comedy");
                break;
            case 3 :
                System.out.println("Drama");
                break;
            default :
                System.out.println("Invalid input");
        }
    }
}
