package practice1.task8;

public class NotificationService {

    private final MessageSender messageSender;

    public  NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void SendNotification(String message) {
        messageSender.send(message);
    }

}
