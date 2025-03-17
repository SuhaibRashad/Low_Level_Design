package BehaviouralPatterns.IteratorPattern.NotificationManagement;
import java.util.Iterator;

public interface NotificationCollection {
    public Iterator<Notification> createIterator();
}