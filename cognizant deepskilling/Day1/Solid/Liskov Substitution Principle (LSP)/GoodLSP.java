interface Vehicle {
    void start();
}

class PetrolCar implements Vehicle {
    @Override
    public void start() {
        System.out.println("Petrol engine started!");
    }
}

class Tesla implements Vehicle {
    @Override
    public void start() {
        System.out.println("Electric motor started!");
    }
}

public class GoodLSP {
    public static void main(String[] args) {
        Vehicle v1 = new PetrolCar();
        v1.start();

        Vehicle v2 = new Tesla();
        v2.start();
    }
}
