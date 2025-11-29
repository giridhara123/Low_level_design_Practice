package Polymorphism.Runtime;

public class SmsNotification implements NotificationSender {

    public void sendNotification(String message) {
        System.out.println(message);
    }
}
