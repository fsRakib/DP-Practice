package Structural.Proxy;

//proxy
public class ATM implements Account {
private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
}

    @Override
    public void withdraw(int amount) {
        // TODO Auto-generated method stub
        
    }



}
