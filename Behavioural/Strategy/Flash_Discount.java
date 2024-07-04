package Behavioural.Strategy;

public class Flash_Discount implements Discount_Strategy {

    @Override
    public void giveDiscount() {

        System.out.println("Flat Discount...");

    }

}
