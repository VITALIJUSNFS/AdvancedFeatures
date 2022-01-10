package generic.example1;

public class StringPrinter {

    private String stringToPrint;

    public StringPrinter(String stringToPrint) {
        this.stringToPrint = stringToPrint;
    }
    public void print(){
        System.out.println(stringToPrint);
    }
}
