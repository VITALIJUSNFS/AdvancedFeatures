package generic.example1;

//Class to store simple integer value and print out

public class IntegerPrinter {

    private Integer integerToPrint;

    public IntegerPrinter(Integer integerToPrint) {
        this.integerToPrint = integerToPrint;

    }

    public void print(){
        System.out.println(integerToPrint);
    }
}
