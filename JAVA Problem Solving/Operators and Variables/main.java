import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of expenses:");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of expense " + i + ": ");
            String expenseName = sc.next();

            System.out.print("Enter amount for " + expenseName + " expense: ");
            double amount = sc.nextDouble();

            total += amount;
        }

        System.out.println("Total Expense: " + total);
    }
}