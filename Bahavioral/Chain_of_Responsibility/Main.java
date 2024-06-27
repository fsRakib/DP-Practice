package Bahavioral.Chain_of_Responsibility;

public class Main {
    public static void main(String[] args) {
        PaymentHandler bank = new BankPaymentHandler();
        PaymentHandler card = new CreditCardPaymentHandler();
        PaymentHandler paypal = new PayPalPaymentHandler();

        bank.setNext(card);
        card.setNext(paypal);

        bank.handlePayment(98);
        bank.handlePayment(599);
        bank.handlePayment(1200);
        card.handlePayment(699);
        bank.handlePayment(1288);
        card.handlePayment(699);
        card.handlePayment(1200);
        paypal.handlePayment(200);
        paypal.handlePayment(1499);
    }
}
