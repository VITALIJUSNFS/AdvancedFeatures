package recap;

public class Baker extends Person{

    public Baker(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("I'm baking pizza. ");

    }

    public void bakeCake(){
        System.out.println("Baking deliciuos cake.");
    }

    @Override
    public void payTaxes() {
        System.out.println("Paying baker taxes 15%");
    }
}
