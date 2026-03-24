import java.util.Scanner;

// Interface: Defines what a bank should do (blueprint)
interface Bank {
    // Abstract methods (no body, only declaration)
    void getBalance();
    void withdraw(int amount);
    void deposit(int amount);
}

// HDFC class implements Bank interface
// This is where actual logic is written
class HDFC implements Bank {

    // Encapsulation: storing balance as a variable
    int total = 0;

    // Method to display current balance
    public void getBalance() {
        System.out.println("Total Balance: " + total);
    }

    // Method to withdraw money
    public void withdraw(int amount) {

        // Check if amount is valid and available
        if (amount <= total && amount > 0) {
            total -= amount; // Deduct amount
            System.out.println("Amount has been debited from your Account");
            System.out.println("Total Balance: " + total);

        } else if (amount <= 0) {
            System.out.println("Add Some Legal Amount");

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Method to deposit money
    public void deposit(int amount) {
        total += amount; // Add amount
        System.out.println("Amount credited successfully");
        System.out.println("Balance: " + total);
    }
}

// Main class (entry point of program)
class BankSystem {
    public static void main(String[] args) {

        // Creating object of HDFC class
        HDFC bk = new HDFC();

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to HDFC bank");

        int n = 0;

        // Loop runs until user chooses Exit
        while (n != 4) {

            // Menu
            System.out.println("\nPlease Select banking option:");
            System.out.println("1: Get your Balance");
            System.out.println("2: Withdraw your money");
            System.out.println("3: Deposit your money");
            System.out.println("4: Exit");

            System.out.print("Enter choice: ");
            n = sc.nextInt();

            // Calling methods based on user input
            if (n == 1) {
                bk.getBalance();

            } else if (n == 2) {
                System.out.print("Enter Amount to withdraw: ");
                int amount = sc.nextInt();
                bk.withdraw(amount);

            } else if (n == 3) {
                System.out.print("Enter Amount to Deposit: ");
                int amount2 = sc.nextInt();
                bk.deposit(amount2);

            } else {
                System.out.println("Exiting...");
                break;
            }
        }

        System.out.println("Thanks for Banking With us");

        // Closing scanner (good practice)
        sc.close();
    }
}