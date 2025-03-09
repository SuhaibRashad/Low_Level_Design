package BehaviouralPatterns.StratergyPattern.ShoppingCart;

public class PayTm implements PayStratergy {
    @Override
    public void pay() {
        System.out.println("Paid using PayTm");
    }
}
