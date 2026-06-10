package Exercise;

interface Document{
    void sent();
}

class wordDocument implements Document{
    public void sent(){
        System.out.println("sent a word Document");
    }
}
class PdfDocument implements Document{
    public void sent(){
        System.out.println("sent a pdf Document");
    }
}
class ExclDocument implements Document{
    public void sent(){
        System.out.println("sent a excl Document");
    }
}

abstract class Documentfactory{
    public abstract Document create();
}

class createword extends Documentfactory{
    public Document create(){
        return new wordDocument();
    }
}
class createpdf extends Documentfactory{
    public Document create(){
        return new PdfDocument();
    }
}
class createexcl extends Documentfactory{
    public Document create(){
        return new ExclDocument();
    }
}
public class FactoryMethodPatternExample {


    public static void main(String[] args) {

        Documentfactory factory;

        factory = new createword();
        Document a = factory.create();
        a.sent();

    }
}