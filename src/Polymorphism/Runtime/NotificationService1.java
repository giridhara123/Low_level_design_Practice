import Polymorphism.Runtime.NotificationSender;

public class NotificationService1 {

    public void Notify(NotificationSender sender, String message)
    {
        sender.sendNotification(message);
    }
}
// NotificationSender email = new EmailNotification();
// NotificationSender sms = new SmsNotification();

//NotificationService1 service = new NotificationService1();
// service.Notify(email,"hey i am Giridhara");
// service.Notify(sms,"hello");
