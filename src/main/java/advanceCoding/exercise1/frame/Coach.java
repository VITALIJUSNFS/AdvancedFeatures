package advanceCoding.exercise1.frame;

public class Coach extends Person{

    private boolean isAngry;
    private String coachStrategy;

    public Coach(String firstName, String lastName, Integer age, double salary, boolean isAngry, String coachStrategy) {
        super(firstName, lastName, age, salary);
        this.isAngry = isAngry;
        this.coachStrategy = coachStrategy;
    }
    public void coachPlayers(){
        System.out.println("Coaching players using strategy" + coachStrategy);
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public String getCoachStrategy() {
        return coachStrategy;
    }

    public void setCoachStrategy(String coachStrategy) {
        this.coachStrategy = coachStrategy;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "isAngry=" + isAngry +
                ", coachStrategy='" + coachStrategy + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
