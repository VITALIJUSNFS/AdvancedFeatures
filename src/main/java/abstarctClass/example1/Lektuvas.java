package abstarctClass.example1;

public class Lektuvas extends TransportoPriemone {

    public Lektuvas(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Skrendu " + getMaxSpeed() + " greiciu.");

    }
}
