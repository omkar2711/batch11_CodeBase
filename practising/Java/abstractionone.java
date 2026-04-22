abstract class Bank {
    abstract void deposit();
    abstract void withdraw();
    abstract int getBalance();
}
class HDFC extends Bank{
    private int balance;

    HDFC(int balance) {
        this.balance = balance;
    }
    public void deposit(){
        balance += 10;
    }
    public void withdraw(){
        balance -= 10;
    }
    public int getBalance(){
        return balance;
    }
}

public class abstractionone {
    public static void main(String[] args) {

        Bank user1 = new HDFC(100);
        System.out.println(user1.getBalance());
        user1.deposit();
        user1.deposit();
        user1.withdraw();
        System.out.println(user1.getBalance());

    }
}
