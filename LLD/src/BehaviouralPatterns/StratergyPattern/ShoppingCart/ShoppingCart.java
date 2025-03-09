package BehaviouralPatterns.StratergyPattern.ShoppingCart;

public class ShoppingCart {
    PayStratergy payObj;

    public void setPayMethod(PayStratergy payObj){
        this.payObj = payObj;
    }

    void pay(){
        payObj.pay();
    }


}
