package generic.example1;


// Generic printer for different types - any given value to print
public class GenericPrinter<T> {

    private T thingToPrint; // Betkoks tipas su kuriuo dirbsime

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }

}
