
// This class is for Q9
public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 500;
    }

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance < amount) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public boolean transfer(double amount, BankAccount otherAccount) {
        if (!withdraw(amount)) {
            return false;
        }

        otherAccount.deposit(amount);
        return true;
    }
}