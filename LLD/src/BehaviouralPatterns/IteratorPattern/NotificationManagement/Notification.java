package BehaviouralPatterns.IteratorPattern.NotificationManagement;

public class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}