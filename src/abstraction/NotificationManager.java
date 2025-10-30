import java.util.List;
import java.util.ArrayList;
public class NotificationManager {

    private List<NotificationService> services;

    public NotificationManager() {
        services = new ArrayList<>();
        services.add(new EmailService());
        services.add(new SMSService());
    }

    public void notifyAll(String message, String recipient )
    {
        services.forEach(service -> {
            if (service.validateRecipient(recipient)) {
                service.send(message, recipient); // let the service print
            }
        });
    }
}

//NotificationManager nm = new NotificationManager();
       // nm.notifyAll("Hello!", "user@example.com"); // should print email send
      //  nm.notifyAll("Hello!", "1234567890");       // should print SMS send
      //  nm.notifyAll("Hello!", "bad");
