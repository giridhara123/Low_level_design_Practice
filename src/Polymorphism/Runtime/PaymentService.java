package Polymorphism.Runtime;

public class PaymentService {

    public void paymentNotify(PaymentProcessor payment, double amount)
    {
        payment.PaymentAmount(amount);
    }
}
// PaymentProcessor paypal = new Paypal();
// PaymentProcessor razor = new Razor();
// PaymentProcessor upi = new UPI();

// PaymentService sender = new PaymentService();

// sender.paymentNotify(paypal, 100.78);
// sender.paymentNotify(razor, 1550.78);
// sender.paymentNotify(upi, 1034.78);