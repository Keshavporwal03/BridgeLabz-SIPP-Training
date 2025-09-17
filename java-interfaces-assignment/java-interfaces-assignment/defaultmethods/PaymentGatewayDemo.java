package defaultmethods;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentProcessor a = new StripeProcessor();
        PaymentProcessor b = new RazorpayProcessor();
        a.processPayment(500); a.refund(200);
        b.processPayment(800); b.refund(300);
    }
}
