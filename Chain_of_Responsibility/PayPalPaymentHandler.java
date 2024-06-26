package Chain_of_Responsibility;

public class PayPalPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {

        if (amount < 1500) {
            System.out.println("Payment of " + amount + " is handled by PayPalPaymentHandler");

        } else {
            next.handlePayment(amount);
        }

    }

}
