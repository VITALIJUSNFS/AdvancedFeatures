package Streams.savarankiskasDarbas.body;

public class Trainer extends Person{

    private String trainingTheme;

    public Trainer(String firstName, String lastName, int age, String trainingTheme) {
        super(firstName, lastName, age);
        this.trainingTheme = trainingTheme;
    }

    public String getTrainingTheme() {
        return trainingTheme;
    }

    public void setTrainingTheme(String trainingTheme) {
        this.trainingTheme = trainingTheme;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "trainingTheme='" + trainingTheme + '\'' +
                '}';
    }
}
