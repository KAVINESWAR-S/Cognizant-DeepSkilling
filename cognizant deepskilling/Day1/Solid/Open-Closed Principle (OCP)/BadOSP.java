class Guitar {
    String type;

    void play() {
        if (type.equals("flames")) {
            System.out.println("Playing flaming guitar!");
        } else {
            System.out.println("Playing guitar...");
        }
    }
}

public class BadOSP {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.type = "flames";
        g.play();
    }
}
