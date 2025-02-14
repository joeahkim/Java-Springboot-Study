public class BankAccount {
    private double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1000);
        b1.deposit(500);
        b1.withdraw(200);
        System.out.println(b1.getBalance());
    }
}
