package batch11_CodeBase;

import java.util.Scanner;

public class FavoriteLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your favorite programming language: ");
        String language = sc.nextLine();

        System.out.println("Your favorite programming language is " + language + ".");
    }
}
