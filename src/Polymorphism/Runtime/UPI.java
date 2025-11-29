import Polymorphism.Runtime.PaymentProcessor;

public class UPI implements PaymentProcessor {

    public void PaymentAmount(double amount)
    {
        System.out.println("Upi amount is"+amount);
    }
}
