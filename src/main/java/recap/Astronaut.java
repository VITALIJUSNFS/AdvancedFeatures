package recap;

public class Astronaut extends Person {

    public Astronaut(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {

    }

    @Override
    public void breathe(){
        System.out.println("Breath with oxigen");
    }

    @Override
    public void payTaxes() {
        System.out.println("Paying taxes 1%");
    }
}
