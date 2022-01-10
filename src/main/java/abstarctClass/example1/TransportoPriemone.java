package abstarctClass.example1;

public abstract class TransportoPriemone {

    private int maxSpeed;

    public TransportoPriemone(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void turnOnEngine(){ //Tinka visoms transporto priemonems
        System.out.println("Turn On Engine");
    }

    /*
    Abstraktus metodai gali tureti ir parametrus
    Abstract metodai neturi kuno / neturi kodo bloko
     */

    public abstract void move(); //zodis "abstract ir nera tiestiniu skliausti


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
