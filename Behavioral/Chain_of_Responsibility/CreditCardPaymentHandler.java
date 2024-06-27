package Behavioral.Behavioral.Chain_of_Responsibility;

public class CreditCardPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        // TODO Auto-generated method stub
        if (amount < 1000) {
            System.out.println("Payment of " + amount + " is handled by CreditCardPaymentHandler");
        } else {
            next.handlePayment(amount);
        }

    }

}
