public class StripePayment implements PaymentGateway {

    public void initializePayment(double amount)
    {
        System.out.println("total amount is $"+ amount+" to be paid via Stripe");

    }
}
