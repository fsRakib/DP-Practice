package Bahavioral.Chain_of_Responsibility;

public class BankPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        // TODO Auto-generated method stub
        if (amount < 500) {
            System.out.println("Payment of " + amount + " is handled by BankPaymentHandler");
        } else {
            next.handlePayment(amount);
        }

    }

}
