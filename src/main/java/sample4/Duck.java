package sample4;

public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
    public void fly(){
        System.out.println("Flying");
    }
}
