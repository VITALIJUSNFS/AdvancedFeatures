package namuDarbasFruit.task1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import namuDarbasFruit.task1.Countries;
/*
tevine
 */

@Data
@AllArgsConstructor

public class Fruit {
    private String name;
    private double price;
    private int quantity;
    private Countries country;

    public void printLabelInformation() {
        System.out.println("**********");
        System.out.println("Fruit name " + name);
        System.out.println("Fruit price " + price);
        System.out.println("Fruit quantity " + quantity);
        System.out.println("Fruit country " + country.getCountryInfo());
        System.out.println("**********");
    }
}
