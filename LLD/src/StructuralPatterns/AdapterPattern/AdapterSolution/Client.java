package StructuralPatterns.AdapterPattern.AdapterSolution;

public class Client {
    public static void main(String[] args) {
//        NotificationService emailService = new EmailNotificationService();
//        emailService.send("customer@codingminutes.com","order confirmation","your order has been received!");

        SendGridService sendGridEmailService = new SendGridService();
        NotificationService emailServiceUsingSendGrid = new SendGridAdapter(sendGridEmailService);
        emailServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been received!");

    }
}
