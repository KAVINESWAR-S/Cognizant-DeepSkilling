interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}

class Caretaker implements BearKeeper {
    @Override
    public void washTheBear() { System.out.println("Washing bear..."); }
    @Override
    public void feedTheBear() { System.out.println("Feeding bear..."); }
    @Override
    public void petTheBear() { throw new UnsupportedOperationException("Too dangerous!"); }
}

public class BadISP {
    public static void main(String[] args) {
        Caretaker c = new Caretaker();
        c.washTheBear();
        c.feedTheBear();
        c.petTheBear(); // Runtime error
    }
}
