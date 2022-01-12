package ndDakar;

public class Team {

    private String teamName;
    private Vehicles vehicle;
    private Driver driver;
    private Navigator navigator;


    public Team(String teamName, Vehicles vehicle, Driver driver) {
        this.teamName = teamName;
        this.vehicle = vehicle;
        this.driver = driver;
    }



    public Team(String teamName, Vehicles vehicle, Driver driver, Navigator navigator) {
        this.teamName = teamName;
        this.vehicle = vehicle;
        this.driver = driver;
        this.navigator = navigator;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Navigator getNavigator() {
        return navigator;
    }

    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", vehicle=" + vehicle +
                ", driver=" + driver +
                ", navigator=" + navigator +
                '}';

    }
}


