package generic.example1;

public class DoublePrinter {

    private Double doubleToPrint;

    public DoublePrinter(Double doubleToPrint) {
        this.doubleToPrint = doubleToPrint;
    }

    public void print(){
        System.out.println(doubleToPrint);
    }
}
