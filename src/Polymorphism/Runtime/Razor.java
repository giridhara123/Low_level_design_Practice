import Polymorphism.Runtime.PaymentProcessor;

public class Razor implements PaymentProcessor {

    public void PaymentAmount(double amount)
    {
        System.out.println("Razor amount is"+amount);

    }
}
