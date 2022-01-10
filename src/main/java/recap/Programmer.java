package recap;

public class Programmer extends Person{

    public Programmer(String name, int age) {
        super(name, age); //calling parent class constructor
    }

    // Ovverride abstract class method work
    @Override
    public void work() {
        System.out.println("I am programmer. ");
    }

    //specifi programmer class method
    public void setUpIntellij(){
        System.out.println("Setting up Intellij IDE");
    }

    @Override
    public void payTaxes() {
        System.out.println("Paying programmer taxes 18%");
    }
}
