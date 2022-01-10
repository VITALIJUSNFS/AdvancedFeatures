package sample3;

public class Actor extends Person{


    public Actor(String name) {
        super(name);
    }

    public void readScenatio (String movieName) {
        System.out.println("Reading scenario mov name"+ movieName);
    }
}
