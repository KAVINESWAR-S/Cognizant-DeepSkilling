package Day3.Exercise.CommandPatternExample;


class Tv{
    public void turnOn(){
        System.out.print("Tv turned on");
    }
    public void turnOf(){
        System.out.println("Tv turned off");
    }
}
interface command{
    void excute();
}

class TurnOncomand implements command{
    private Tv tv;

    public TurnOncomand(Tv tv){
        this.tv=tv;
    }

    public void excute(){
        tv.turnOn();
    }
}

class TurnOffcomand implements command{
    private Tv tv;

    public TurnOffcomand(Tv tv){
        this.tv=tv;
    }

    public void excute(){
        tv.turnOf();
    }
}

class Remotecontrol{
    private command com;

    public void set(command com){
        this.com=com;
    }

    public void press(){
        com.excute();
    }
}

public class CommandPatternExample {
    public static void main(String[] args){
        Tv a = new Tv();
        command on = new TurnOncomand(a);
        command off = new TurnOffcomand(a);

        Remotecontrol b = new Remotecontrol();

        b.set(on);
        b.press();

        b.set(off);
        b.press();

    }
}
