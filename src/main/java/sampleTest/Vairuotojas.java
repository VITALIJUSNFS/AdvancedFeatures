package sampleTest;

public class Vairuotojas extends Worker {

    public Vairuotojas(String name) {
        super(name);
    }

    @Override
    public void salary() {
        System.out.println("Name:" + getName());
        super.salary();
        System.out.println("500 EUR");
    }

    @Override
    public void jobDefinition() {
        super.jobDefinition();
        System.out.println("Vairuotojas, Vairuoju");
    }
}
