package BehaviouralPatterns.StratergyPattern.ShoppingCart;

public class PhonePe implements PayStratergy {
    public void pay() {
        System.out.println("Paid using PhonePe");
    }
}
