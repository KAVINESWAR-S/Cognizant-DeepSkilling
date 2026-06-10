package Exercise;

interface PaymentProcess{
    void processPayment();
}

class paypal{
    public void sentMoney(){
        System.out.println("Paypal paymet processed");
    }
}
class juspay{
    public void makePayment(){
        System.out.println("Juspay payment processed");
    }
}

class paypalAdapter implements PaymentProcess{
    private paypal paypal;
    public paypalAdapter (paypal paypa){
        this.paypal=paypa;
    }

    public void processPayment(){
        paypal.sentMoney();
    }

}
class juspayAdapter implements PaymentProcess{
    private juspay juspay;
    public juspayAdapter (juspay jus){
        this.juspay=jus;
    }

    public void processPayment(){
        juspay.makePayment();
    }

}
public class AdapterPatternExample {
    public static void main(String[] args){
        paypal a = new paypal();
        paypalAdapter d = new paypalAdapter(a);
        d.processPayment();
    }
}
