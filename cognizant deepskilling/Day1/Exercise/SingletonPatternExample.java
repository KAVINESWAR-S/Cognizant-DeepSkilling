package Exercise;
class Logger{
    private static Logger ints;

    private Logger(){
        System.out.println("logger Created");
    }

    public static Logger getInstance(){
        if(ints==null){
            ints=new Logger();
        }
        return ints;
    }
}
public class SingletonPatternExample{
    public static void main(String[] args){
        Logger in1 = Logger.getInstance();
        //in1.Logger();
        Logger in2 = Logger.getInstance();

    }
}
