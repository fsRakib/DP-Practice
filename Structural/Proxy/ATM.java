package Structural.Proxy;

//proxy
public class ATM implements Account {
    private BankAccount bankAccount;
    
    public ATM(BankAccount initialBalance) {
        this.bankAccount = new BankAccount(initialBalance);
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0) {
            BankAccount.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }

    }

}
