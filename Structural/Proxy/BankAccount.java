package Structural.Proxy;

//proxy
public class BankAccount implements Account {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amount) {
       if(amount<=balance){
        System.out.println("Withdraw Possible");
       }
       else{
        System.out.println("Withdraw imPossible");
       }

    }

}
