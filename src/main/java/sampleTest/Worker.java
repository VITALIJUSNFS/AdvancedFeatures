package sampleTest;

public class Worker {

    public void salary() {
        System.out.print("Basic salary: ");
    }

    public void jobDefinition() {
        System.out.print("Work definition: ");
    }

    public Worker(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
