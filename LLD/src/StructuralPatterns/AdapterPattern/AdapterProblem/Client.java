package StructuralPatterns.AdapterPattern.AdapterProblem;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirmation","your order has been received!");

        //NotificationService sendGridEmailService = new SendGridService();
//        NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
//        emailServiceUsingSendGrid.send("customer@codingminutes.com","order confirmation","your order has been received!");

    }
}
