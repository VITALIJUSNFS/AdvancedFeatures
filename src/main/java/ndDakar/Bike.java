package ndDakar;

public class Bike extends Vehicles {

    public Bike(String vehicleType, int maxSpeed, int qtyOfWheels) {
        super(vehicleType, maxSpeed, qtyOfWheels);
    }

    @Override
    public void move() {
        System.out.println("Bike drive on rear wheel");

    }
}

class Trucks extends Vehicles {

    public Trucks(String vehicleType, int maxSpeed, int qtyOfWheels) {
        super(vehicleType, maxSpeed, qtyOfWheels);
    }

    @Override
    public void move() {
        System.out.println("Truck move creates vibration");

    }
}

class SUV extends Vehicles {


    public SUV(String vehicleType, int maxSpeed, int qtyOfWheels) {
        super(vehicleType, maxSpeed, qtyOfWheels);
    }

    @Override
    public void move() {
        System.out.println("SUV good tracking");

    }
}
