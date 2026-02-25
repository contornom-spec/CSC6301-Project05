import java.util.ArrayList;
import java.util.List;

/**
 * Core alert system using composition.
 * This class must NOT be modified for maintenance enhancement.
 */
public class AlertSystem {

    private NotificationMedium medium;
    private List<String> log;

    public AlertSystem(NotificationMedium medium) {
        this.medium = medium;
        this.log = new ArrayList<>();
    }

    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    public void triggerAlert(String message) {
        medium.send(message);
        log.add(message);
    }

    public List<String> getLog() {
        return log;
    }
}