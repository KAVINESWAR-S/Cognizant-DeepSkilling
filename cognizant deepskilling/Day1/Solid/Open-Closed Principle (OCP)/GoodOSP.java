class Guitar {
    void play() {
        System.out.println("Playing guitar...");
    }
}

class SuperCoolGuitarWithFlames extends Guitar {
    @Override
    void play() {
        System.out.println("Playing flaming guitar!");
    }
}

public class GoodOSP {
    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        g1.play();

        Guitar g2 = new SuperCoolGuitarWithFlames();
        g2.play();
    }
}
