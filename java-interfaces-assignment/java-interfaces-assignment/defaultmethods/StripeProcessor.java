package defaultmethods;

public class StripeProcessor implements PaymentProcessor {
    @Override public void processPayment(double amount) {
        System.out.println("Stripe processed ₹" + amount);
    }
    // Uses default refund()
}
