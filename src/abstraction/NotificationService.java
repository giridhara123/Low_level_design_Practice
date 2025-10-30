public interface NotificationService {
    void send(String message, String recipient);
    boolean validateRecipient(String recipient);
    NotificationStatus getStatus();
}
