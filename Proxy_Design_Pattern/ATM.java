package Proxy_Design_Pattern;

//Proxy 
public class ATM implements Account {
    private BankAccount bankAccount;

    public ATM(String accountNumber, double initialBalance) {
        this.bankAccount = new BankAccount(accountNumber, initialBalance);
    }

    @Override
    public String getAccountNumber() {
        return bankAccount.getAccountNumber();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("ATM proxy: Checking account and withdrawing...");
        bankAccount.withdraw(amount);
    }
}
