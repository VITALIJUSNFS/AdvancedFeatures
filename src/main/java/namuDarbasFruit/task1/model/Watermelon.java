package namuDarbasFruit.task1.model;

import namuDarbasFruit.task1.Countries;

public class Watermelon extends Fruit {

    public Watermelon(String name, double price, int quantity, Countries country) {
        super(name, price, quantity, country);
    }

    @Override
    public void printLabelInformation() {
        super.printLabelInformation();
        System.out.println("Watermelon");
    }
}
