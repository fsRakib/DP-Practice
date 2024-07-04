package Behavioural.Strategy;

public class Apply_Discount {
    Discount_Strategy discount_Strategy;

    public Apply_Discount(Discount_Strategy discount_Strategy) {
        this.discount_Strategy = discount_Strategy;
    }

    void getDiscount() {
        discount_Strategy.giveDiscount();
    }

    void setStrategy(Discount_Strategy discount_Strategy) {
        this.discount_Strategy = discount_Strategy;
    }

}
