package Day3.Exercise.StrategyPatternExample;

interface PaymentStrategy{
    void pay(int amount);
}

class upiPayment implements PaymentStrategy{

    public void pay(int amt){
        System.out.println("$"+amt+"Payed using upi");
    }
}

class creditPayment implements PaymentStrategy{

    public void pay(int amt){
        System.out.println("$"+amt+"payed using credit card");
    }
}

class PaymentContext{
    private PaymentStrategy paymenttype;

    public void amount(PaymentStrategy type){
        this.paymenttype=type;
    }

    public void sent(int amt){
        paymenttype.pay(amt);
    }
}

public class StrategyPatternExample {
    public static void main(String[] args){
        PaymentContext a = new PaymentContext();
        a.amount(new upiPayment());
        a.sent(5000);
        System.out.println("using credit card");

        a.amount(new creditPayment());
        a.sent(6000);
    }
}
