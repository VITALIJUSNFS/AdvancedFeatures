package uzduotisFruit;

public class FruitShippingService {

    String name;
    String type;
    String weight;

    public void Fruit(String name, String type, String weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public enum Countries {
        EE ("Estonia", "Tallinn"),
        LV ("Lavia", "Riga"),
        LT ("Lithuania","Vilnius");

        final String Country;
        final String city;

        Countries(String country, String city) {
            Country = country;
            this.city = city;
        }
    }

    public void deliveringService() {

        System.out.println("Delivering"+Countries.EE.Country);
        System.out.println();

    }
}
