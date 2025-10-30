public class SMSService implements NotificationService {

    public void send(String message, String recipient)
    {
        if(validateRecipient(recipient))
        {
            System.out.println("Sending message to "+recipient);
        }
    }

    public boolean validateRecipient(String recipient)
    {
        if( recipient!= null && recipient.matches("\\d{10}"))
        {
            return true;
        }
        return false;
    }
    public NotificationStatus getStatus()
    {

        return NotificationStatus.SENT;
    }
}
