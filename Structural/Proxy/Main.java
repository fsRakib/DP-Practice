package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000);
        atm.withdraw(100);
    }
}
