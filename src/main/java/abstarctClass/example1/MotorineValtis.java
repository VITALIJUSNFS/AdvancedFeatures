package abstarctClass.example1;

public class MotorineValtis extends TransportoPriemone {

    public MotorineValtis(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Plaukiu" + getMaxSpeed() + "greiciu");

    }
}
