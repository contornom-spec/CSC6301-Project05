/**
 * Email notification implementation.
 */
public class EmailService implements NotificationMedium {

    @Override
    public void send(String message) {
        System.out.println("[Email] Sending message: " + message);
    }
}