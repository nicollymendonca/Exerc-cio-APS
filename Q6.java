public class NotificationService {
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to: " + email);
        System.out.println("Message: " + message);
    }
}

public class OrderSystem {
    private NotificationService notificationService;

    public OrderSystem(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(String email, String product) {
        System.out.println("Processing order for: " + email);
        System.out.println("Product: " + product);
        notificationService.sendEmail(email, "Your order for " + product + " has been processed.");
    }
}

NotificationService notificationService = new NotificationService();
OrderSystem orderSystem = new OrderSystem(notificationService);
