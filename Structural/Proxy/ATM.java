package Structural.Proxy;

// Proxy
public class ATM implements Account {
    private BankAccount bankAccount;

    public ATM(int initialBalance) {
        this.bankAccount = new BankAccount(initialBalance);
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0) {
            bankAccount.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
