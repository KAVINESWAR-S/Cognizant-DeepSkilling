interface BearCleaner {
    void washTheBear();
}

interface BearFeeder {
    void feedTheBear();
}

class Caretaker implements BearCleaner, BearFeeder {
    @Override
    public void washTheBear() { System.out.println("Washing bear..."); }
    @Override
    public void feedTheBear() { System.out.println("Feeding bear..."); }
}

public class GoodISP {
    public static void main(String[] args) {
        Caretaker c = new Caretaker();
        c.washTheBear();
        c.feedTheBear();
    }
}
