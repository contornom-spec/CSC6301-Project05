/**
 * WhatsAppService implements the existing NotificationMedium interface.
 * Added as a maintenance enhancement without modifying core classes.
 */
public class WhatsAppService implements NotificationMedium {

    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}