package sampleTest;

public class Virejas extends Worker {

    public Virejas(String name) {
        super(name);

    }

    @Override
    public void salary() {
        System.out.println("Name:" + getName());
        super.salary();
        System.out.println("300 EUR");
    }

    @Override
    public void jobDefinition() {
        super.jobDefinition();
        System.out.println("Virejas, Eksperemintuoju");

    }
}
