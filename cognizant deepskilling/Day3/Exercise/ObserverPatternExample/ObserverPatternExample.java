package Day3.Exercise.ObserverPatternExample;
import java.util.ArrayList;
import java.util.List;
interface stock{
    void Register(observer user);
    void DeRegister(observer user);
    void Notify();
}

class users implements stock{
    private ArrayList<observer> users;
    private String stockname;
    private double stockprice;

    public users(){
        users=new ArrayList<>();
    }

    public void Register(observer user){
        this.users.add(user);
    }

    public void DeRegister(observer user){
        this.users.remove(user);
    }

    public void Notify(){
        for(observer user:users){
            user.update(stockname, stockprice);
        }
    }

    public void updateStock(String stockname,double stockprice){
        this.stockname=stockname;
        this.stockprice=stockprice;

        System.out.print("the Stock"+stockname+"with price:"+stockprice+"has been updated");

        Notify();
    }

}

class mobileuser implements observer{
    private String userName;

    public mobileuser(String userName) {
        this.userName = userName;
    }
    public void update(String stockname,double stockprice){
        System.out.println(
            "Mobile App [" + userName + "] received update -> "
            + stockname + " : ₹" + stockprice
        );

    }
}

class webuser implements observer{
    private String userName;

    public webuser(String userName) {
        this.userName = userName;
    }
    public void update(String stockname,double stockprice){
        System.out.println(
            "web App [" + userName + "] received update -> "
            + stockname + " : ₹" + stockprice
        );

    }
}


public class ObserverPatternExample{
    public static void main(String[] args){
        users a = new users();

        mobileuser b = new mobileuser("kavin");
        webuser c = new webuser("eswar");

        a.Register(b);
        a.Register(c);
        a.updateStock("tcs", 345.0);
        a.updateStock("tata", 645);
    }
}
