package BehaviouralPatterns.StratergyPattern.ShoppingCart;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPayMethod(new GooglePay());
        cart.pay();
        cart.setPayMethod(new PhonePe());
        cart.pay();
        cart.setPayMethod(new PayTm());
        cart.pay();
    }

}
