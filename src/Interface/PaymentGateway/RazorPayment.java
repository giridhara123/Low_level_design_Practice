public class RazorPayment implements PaymentGateway {

    public void initializePayment(double amount)
    {
        System.out.println("the total amount is $"+ amount + " to be paid via Razor");
    }
}
