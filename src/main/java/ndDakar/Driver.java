package ndDakar;

public class Driver extends TeamMates implements DriverActions{


    public Driver(String firstName, String secondName, String country, String experience, int salary) {
        super(firstName, secondName, country, experience, salary);
    }

    @Override
    public void driverDriving() {
        System.out.println("Start rasing with speed 175km/h");
    }

    @Override
    public void driverResting() {
        System.out.println("Driver has break for 25 min");

    }

    @Override
    public void driverEating() {
        System.out.println("Driver have nice breakfast today");

    }
}
