package Exercise;

//import java.lang.classfile.Superclass;

interface Notifi{
    String send();
}

class emailNotification implements Notifi{
    public String send(){
        return "Email Notification sent";
    }
}

abstract class NotifiDecorator implements Notifi{
    protected Notifi notifi;

    public NotifiDecorator(Notifi notifi){
        this.notifi=notifi;
    }
}

class SmsDecorator extends NotifiDecorator{

    public SmsDecorator( Notifi notifi){
        super(notifi);
    }
    public String send(){
        return notifi.send()+"+ Sms NOtification Sent";
    }
}

class whatappDecorator extends NotifiDecorator{
    
    public whatappDecorator( Notifi notifi){
        super(notifi);
    }
    public String send(){
       return notifi.send()+" + whatsapp NOtification Sent";
    }
}

public class DecoratorPatternExample{
    public static void main(String[] args){
        Notifi a = new whatappDecorator(
            new SmsDecorator(
                new emailNotification()
            )
        );
        System.out.print(a.send());
    }
}