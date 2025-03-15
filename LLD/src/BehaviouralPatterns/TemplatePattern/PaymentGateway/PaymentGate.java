package BehaviouralPatterns.TemplatePattern.PaymentGateway;


abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void sendMoney(){
        validateRequest();
        calculateFees();
        creditAmount();
        debitAmount();

    }

}

class PaymentToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("PaymentToFriend : validated");
    }

    @Override
    public void calculateFees() {
        System.out.println("PaymentToFriend : fees 5rs");

    }

    @Override
    public void debitAmount() {
        System.out.println("PaymentToFriend : amount debited");

    }

    @Override
    public void creditAmount() {
        System.out.println("PaymentToFriend : amount credited");

    }
}


class PaymentToMerchant extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("PaymentToMerchant : validated");
    }

    @Override
    public void calculateFees() {
        System.out.println("PaymentToMerchant : fees 15rs");

    }

    @Override
    public void debitAmount() {
        System.out.println("PaymentToMerchant : amount debited");

    }

    @Override
    public void creditAmount() {
        System.out.println("PaymentToMerchant : amount credited");

    }
}

public class PaymentGate {
    public static void main(String[] args) {
PaymentFlow friend = new PaymentToFriend();
PaymentFlow merchant = new PaymentToMerchant();
friend.sendMoney();
merchant.sendMoney();
    }
}
