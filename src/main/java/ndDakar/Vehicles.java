package ndDakar;

public abstract class Vehicles {

    private String vehicleType;
    private int maxSpeed;
    private int qtyOfWheels;

    public abstract void move();

    public Vehicles(String vehicleType, int maxSpeed, int qtyOfWheels) {
        this.vehicleType = vehicleType;
        this.maxSpeed = maxSpeed;
        this.qtyOfWheels = qtyOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "vehicleType='" + vehicleType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", qtyOfWheels=" + qtyOfWheels +
                '}';
    }
}
