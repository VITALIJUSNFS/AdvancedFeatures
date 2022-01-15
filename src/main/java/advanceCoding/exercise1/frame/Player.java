package advanceCoding.exercise1.frame;

public class Player extends Person {

    private int experience;
    private String nationality;
    private SkillMove skillMove;

    public Player(String firstName, String lastName, Integer age,
                  double salary, int experience, String nationality, SkillMove skillMove) {
        super(firstName, lastName, age, salary);
        this.experience = experience;
        this.nationality = nationality;
        this.skillMove = skillMove;
    }

    public void doSkillMove() {
        System.out.println("I m doing mine skill move " + skillMove);
    }

    public int getExperience() {
        return experience;
    }

    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", experience=" + experience +
                ", nationality='" + nationality + '\'' +
                ", skillMove=" + skillMove +
                '}';
    }

}

