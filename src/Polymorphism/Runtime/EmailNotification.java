package Polymorphism.Runtime;

public class EmailNotification implements NotificationSender {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email"+ message);

    }
}
