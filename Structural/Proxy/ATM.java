package Structural.Proxy;

//proxy
public class ATM implements Account {

    @Override
    public void withdraw() {
        System.out.println("Money withdraw from ATM");

    }

}
