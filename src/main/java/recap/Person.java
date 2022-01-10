package recap;

public abstract class Person implements TaxPayer {

    private String name;
    private int age;
    private ExpirienceLevel level;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void breathe(){
        System.out.println("Brething ...");
    }

    //* abstractus metodas:
    public abstract void work();


    public ExpirienceLevel getLevel() {
        return level;
    }

    public void setLevel(ExpirienceLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }
}
