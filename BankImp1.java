 interface Bank {
    void deposit(int amount);
    void withdraw(int amount);
    int getBalance();
}

class HDFC implements Bank {
    private int balance;

    HDFC(int amount){
        this.balance = amount;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    public int getBalance(){
        return balance;
    }

}

public class BankImp1 {
    public static void main(String[] args) {
        HDFC user1 = new HDFC(100);
        System.out.println(user1.getBalance());
        user1.withdraw(10);
        System.out.println(user1.getBalance());
        user1.withdraw(10);
        System.out.println(user1.getBalance());
    }
}


// Interface ia s blueprint/Contract of a class
//properties of Interface
//1. we need to used "Implements" keyword while using interfaces
//2. we can only/default create public abstract methods in the interface
//3. variables are final and static only

