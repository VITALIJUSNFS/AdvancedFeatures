package namuDarbasFruit.task1;

public enum Countries {

    SPAIN(3000, 15, "Spain"),
    ITALY(2000, 21.5, "Italy"),
    POLAND(300, 18, "Poland");

    final int destinationInKm;
    final double shippingPrice;
    final String countryOfOrigin;


    Countries(int destinationInKm, double shippingPrice, String countryOfOrigin) {
        this.destinationInKm = destinationInKm;
        this.shippingPrice = shippingPrice;
        this.countryOfOrigin = countryOfOrigin;

    }

    public String getCountryInfo() {
        return "/Country " + countryOfOrigin + "/ Destination " + destinationInKm + "/ Price: " + shippingPrice + "/";
    }
}
