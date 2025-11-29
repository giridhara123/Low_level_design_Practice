public class CheckOut {

    private PaymentGateway paymentGateway;

    public CheckOut(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount)
    {
        paymentGateway.initializePayment(amount);
    }
}
// we are creating payment methods as object to pass them as variables to switch in check out
//PaymentGateway stripe =  new StripePayment();
//PaymentGateway razor =  new RazorPayment();
// variable is passed to constructor to set a payment method as stripe
//CheckOut service = new CheckOut(stripe);
        //service.checkout(100);
//switched the payment method
       // service.setPaymentGateway(razor);
       // service.checkout(1045);