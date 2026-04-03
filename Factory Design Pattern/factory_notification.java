public abstract class Notification {
    // Abstract method to be implemented by concrete notification types
    public abstract void send();
}

public class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS Notification.");
    }
}

public class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending Email Notification.");
    }
}

// TODO: Create NullNotification class that extends Notification
public class NullNotification extends Notification {

    // TODO: Implement the send() method to print "Unsupported Notification Type."
    @Override
    public void send() {
        System.out.println("Unsupported Notification Type.");
    }
}

public class NotificationFactory {
    // Enum to define supported notification types
    public enum NotificationType {
        SMS, EMAIL
    }

    // Factory method to create notifications based on the type
    // TODO: Modify this method to handle unsupported types gracefully using NullNotification
    public static Notification getNotification(NotificationType type) {

        // Handle null input
        if (type == null) {
            return new NullNotification();
        }

        switch (type) {
            case SMS:
                return new SMSNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                // TODO: Return a NullNotification instead of throwing an exception
                return new NullNotification();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an SMS notification using the factory method
        Notification smsNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.SMS);
        smsNotification.send(); // Outputs: Sending SMS Notification.

        // Create an Email notification using the factory method
        Notification emailNotification = NotificationFactory.getNotification(NotificationFactory.NotificationType.EMAIL);
        emailNotification.send(); // Outputs: Sending Email Notification.

        // TODO: Test the factory with an unsupported notification type
        Notification unsupportedNotification = NotificationFactory.getNotification(null);
        unsupportedNotification.send(); // Should output: Unsupported Notification Type.
    }
}