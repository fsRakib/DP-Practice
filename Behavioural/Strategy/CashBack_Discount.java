package Behavioural.Strategy;

public class CashBack_Discount implements Discount_Strategy {

    @Override
    public void giveDiscount() {

        System.out.println("CashBack Discount...");

    }

}
