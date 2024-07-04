package Structural.Proxy;

//Real Subject
public class BankAccount implements Account {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal amount: " + amount + ". Current balance: " + balance);
        }
    }
}
