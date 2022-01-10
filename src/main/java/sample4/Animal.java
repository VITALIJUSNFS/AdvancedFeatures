package sample4;

public class Animal {

    private String name;

    public void makeSound(){
        System.out.println("Animal sound.");
    }

    public void breath(){
        System.out.println("Making generic sound ");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
