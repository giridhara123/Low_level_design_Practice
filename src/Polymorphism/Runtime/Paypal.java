import Polymorphism.Runtime.PaymentProcessor;

public class Paypal implements PaymentProcessor {

    public void PaymentAmount(double amount) {
        System.out.println("Paypal amount is " + amount);
    }
}
