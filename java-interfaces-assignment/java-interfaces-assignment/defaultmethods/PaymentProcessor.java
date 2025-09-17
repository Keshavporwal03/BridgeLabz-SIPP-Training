package defaultmethods;

public interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Default refund of ₹" + amount + " initiated (generic).");
    }
}
