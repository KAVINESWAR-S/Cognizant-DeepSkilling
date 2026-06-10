class StandardKeyboard {
    public void type() {
        System.out.println("Typing with standard keyboard...");
    }
}

class Windows98Machine {
    private StandardKeyboard keyboard;

    public Windows98Machine() {
        this.keyboard = new StandardKeyboard(); // tightly coupled
    }

    public void powerOn() {
        System.out.println("Windows 98 booting...");
        keyboard.type();
    }
}

public class BadDIP {
    public static void main(String[] args) {
        Windows98Machine machine = new Windows98Machine();
        machine.powerOn();
    }
}
