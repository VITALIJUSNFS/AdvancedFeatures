package namuDarbasFruit.task1.model;

import namuDarbasFruit.task1.Countries;

public class Banana extends Fruit {

    public Banana(String name, double price, int quantity, Countries country) {
        super(name, price, quantity, country);
    }
    //Si karta ne overrridinu printLabelInformation method, bet vistiek ji turesiu paveldeta is Fruit class
}
