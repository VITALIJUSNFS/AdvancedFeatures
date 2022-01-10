package namuDarbasFruit.task1;

public class Banana extends Fruit {

    public Banana(String name, double price, int quantity, Countries country) {
        super(name, price, quantity, country);
    }
    //Si karta ne overrridinu printLabelInformation method, bet vistiek ji turesiu paveldeta is Fruit class
}
