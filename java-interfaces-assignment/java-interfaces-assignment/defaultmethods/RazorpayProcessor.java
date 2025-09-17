package defaultmethods;

public class RazorpayProcessor implements PaymentProcessor {
    @Override public void processPayment(double amount) {
        System.out.println("Razorpay processed ₹" + amount);
    }
    @Override public void refund(double amount) {
        System.out.println("Razorpay instant refund of ₹" + amount + " completed.");
    }
}
