import java.util.List;

/**
 * CLI test harness for WhatsApp maintenance enhancement.
 */
public class MaintenanceTest {

    public static void main(String[] args) {

        AlertSystem alertSystem = new AlertSystem(new EmailService());

        // Email
        alertSystem.triggerAlert("Email test - System maintenance at 10 PM.");

        // Switch to SMS
        alertSystem.setMedium(new SMSService());
        alertSystem.triggerAlert("SMS test - Your verification code is 123456.");

        // Switch to WhatsApp
        alertSystem.setMedium(new WhatsAppService());
        alertSystem.triggerAlert("WhatsApp test - Campaign launch tomorrow at 9 AM.");

        System.out.println("\n--- Alert Log ---");
        List<String> log = alertSystem.getLog();
        for (int i = 0; i < log.size(); i++) {
            System.out.println((i + 1) + ". " + log.get(i));
        }
    }
}