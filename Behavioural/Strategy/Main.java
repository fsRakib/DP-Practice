package Behavioural.Strategy;

public class Main {
    public static void main(String[] args) {
        Apply_Discount apply_Discount = new Apply_Discount(new CashBack_Discount());
        apply_Discount.getDiscount();

        apply_Discount.setStrategy(new Flash_Discount());
        apply_Discount.getDiscount();
    }
}
