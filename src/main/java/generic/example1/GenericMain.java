package generic.example1;

public class GenericMain {

    public static void main(String[] args) {

        /**
         * Generic type is ageneric class or interface that is parametrized over types
         */

        IntegerPrinter integerPrinter = new IntegerPrinter(5);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(22.5);
        doublePrinter.print();

        StringPrinter stringPrinter = new StringPrinter("Labas");
        stringPrinter.print();

        GenericPrinter<String> genericStringPrinter = new GenericPrinter("CD");
        genericStringPrinter.print();

        GenericPrinter<DoublePrinter> genericDoublePrinter = new GenericPrinter("0.123");
        genericDoublePrinter.print();

        GenericPrinter<IntegerPrinter> genericInteger =  new GenericPrinter(1);
        genericInteger.print();





    }
}
