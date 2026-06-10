interface Keyboard {
    void type();
}

class StandardKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with standard keyboard...");
    }
}

class MechanicalKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing with mechanical keyboard...");
    }
}

class Windows98Machine {
    private Keyboard keyboard;

    public Windows98Machine(Keyboard keyboard) {
        this.keyboard = keyboard; // injected dependency
    }

    public void powerOn() {
        System.out.println("Windows 98 booting...");
        keyboard.type();
    }
}

public class GoodDIP {
    public static void main(String[] args) {
        Keyboard kb1 = new StandardKeyboard();
        Windows98Machine machine1 = new Windows98Machine(kb1);
        machine1.powerOn();

        Keyboard kb2 = new MechanicalKeyboard();
        Windows98Machine machine2 = new Windows98Machine(kb2);
        machine2.powerOn();
    }
}
