package Structural.Proxy;
//proxy
public class ATM  implements Account{

    @Override
    public void getAccountNumber() {
        BankAccount bankAccount= new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void withdraw() {
        // TODO Auto-generated method stub
        
    }
    
}
