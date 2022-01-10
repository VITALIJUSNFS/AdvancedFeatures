package sample2Game;

public class Main {

    public static void main(String[] args) {

        Automobilis volvo = new Automobilis();
        volvo.setRatuSkaicius(4);
        System.out.println(volvo.getRatuSkaicius());
        volvo.vaziuok();
        volvo.stok();

        Tankas tankas = new Tankas();
        tankas.saukIsPabuklo();
        tankas.vaziuok();
        tankas.stok();
        System.out.println("Tankas turi viksrus " + tankas.getTuriViksrus());
        System.out.println("Tankas turi kulku " + tankas.getKulkuSkaicius());

        Tankete tankete = new Tankete();
        tankete.saukIsAutomato(); //specifinis tanketes veiksmas
        tankete.setTuriViksrus(false); //Tankas klaseje aprasytas

        tankete.saukIsPabuklo(); //irgi is tanko
        tankete.vaziuok(); //is transporto priemones
        tankete.stok(); //is transporto priemones
    }
}

