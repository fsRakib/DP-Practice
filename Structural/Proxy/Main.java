package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Account atm = new ATM("5132", 1000.0);
        atm.withdraw(100.0);
        atm.withdraw(500.0);
        atm.withdraw(600.0);
    }

}
