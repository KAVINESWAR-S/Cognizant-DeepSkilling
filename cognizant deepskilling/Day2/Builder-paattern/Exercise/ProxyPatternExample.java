package Exercise;

interface image{
    void display();
}

class RealImage implements image{

    String filename;
    public RealImage(String fileName) {
        this.filename = fileName;
        loadFromServer();
    }
    private void loadFromServer() {
        System.out.println(
            "Loading " + filename +
            " from remote server...");
    }
    public void display(){
        System.out.print("Image Displayed");
    }
}

class ProxyImage implements image{

    String filename;
    private RealImage img;

    public ProxyImage(String filename){
        this.filename=filename;
    }

    public void display(){
        if(img == null){
            System.out.println("Loading Img");
            img = new RealImage(filename);
        }
        else{
            System.out.println("Using cahed img");
        }
        img.display();
    }
}

public class ProxyPatternExample {
    public static void main(String[] args){
        ProxyImage dp = new ProxyImage("natural.jpg");
        dp.display();
        dp.display();
    }
}
