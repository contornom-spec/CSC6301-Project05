/**
 * SMS notification implementation.
 */
public class SMSService implements NotificationMedium {

    @Override
    public void send(String message) {
        System.out.println("[SMS] Sending message: " + message);
    }
}