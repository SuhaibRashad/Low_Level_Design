package StructuralPatterns.FacadePattern.MicroServiceSolution;

public class ServiceFacade {
    UserService userService;
    OrderService orderService;
    PaymentService paymentService;

    public ServiceFacade(){
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    //Task
    public String getFullOrderDetails(String userId,String orderId,String paymentId){
        String userDetails = userService.getUserDetails(userId);
        String orderDetails = orderService.getOrderDetails(orderId);
        String paymentProcessing = paymentService.processPayment(paymentId);

        return userDetails + "\n" + orderDetails + "\n" + paymentProcessing;
    }
}
