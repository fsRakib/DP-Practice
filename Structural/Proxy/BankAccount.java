package Structural.Proxy;

// Real subject
public class BankAccount implements Account {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= balance) {
            System.out.println("Withdraw Possible");
        } else {
            System.out.println("Withdraw imPossible");
        }
    }
}
