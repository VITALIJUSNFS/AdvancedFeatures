package sampleTest;

public class Daktaras extends Worker {
    public Daktaras(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("Name:" + getName());
        super.salary();
        System.out.println("900 EUR");
    }

    @Override
    public void jobDefinition() {
        super.jobDefinition();
        System.out.println("Daktaras, Vakcinuoju:)");
    }
}
