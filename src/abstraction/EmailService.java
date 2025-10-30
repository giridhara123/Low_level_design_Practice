public class EmailService implements NotificationService{

    public void send(String message, String recipient)
    {
        if(validateRecipient(recipient))
        {
            System.out.println("sending email to:"+recipient);
        }
    }

    public boolean validateRecipient(String recipient)
    {
        if( recipient!= null && recipient.contains("@") ){
            return true;
        }
        return false;
    }

    public NotificationStatus getStatus()
    {

        return NotificationStatus.SENT;
    }



}
