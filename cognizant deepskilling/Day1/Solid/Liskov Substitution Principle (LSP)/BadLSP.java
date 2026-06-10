interface Car {
    void turnOnEngine();
}

class ElectricCar implements Car {
    @Override
    public void turnOnEngine() {
        throw new UnsupportedOperationException("No engine!");
    }
}

public class BadLSP {
    public static void main(String[] args) {
        Car c = new ElectricCar();
        c.turnOnEngine(); // Runtime error
    }
}
