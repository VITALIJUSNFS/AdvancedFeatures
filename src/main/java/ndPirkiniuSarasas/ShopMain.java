package ndPirkiniuSarasas;

import java.util.*;

public class ShopMain {
    public static void main(String[] args) {


        Items apple = new Items("Apple", 5.2, 100);
        Items tv = new Items("TV", 12, 100);
        Items mouse = new Items("Mouse", 3, 100);
        Items charger = new Items("Charger", 20, 100);
        Items milk = new Items("Milk", 2, 100);
        Items bread = new Items("Bread", 3.5, 100);
        Items rice = new Items("Rice", 1, 100);

        List<Items> warehouseListAndQuantities = new ArrayList<>();
        warehouseListAndQuantities.add(apple);
        warehouseListAndQuantities.add(tv);
        warehouseListAndQuantities.add(mouse);
        warehouseListAndQuantities.add(charger);
        warehouseListAndQuantities.add(milk);
        warehouseListAndQuantities.add(bread);
        warehouseListAndQuantities.add(rice);

        double stockValue = 0;
        int stockQuantity = 0;

        System.out.println("**************Shop stock********************");

        for (Items stock : warehouseListAndQuantities) {
            System.out.println(stock);
            stockValue += stock.getPrice() * stock.getQuantity();
            stockQuantity += stock.getQuantity();
        }
        System.out.println("********************************************");
        System.out.println("Stock value: " + stockValue + " Euro.");
        System.out.println("Items quantity: " + stockQuantity + " qty");
        System.out.println("********************************************");

        Map<DaysOfWeek, Items> itemsPurchased = new LinkedHashMap<>();
        itemsPurchased.put(DaysOfWeek.MON, tv);
        itemsPurchased.put(DaysOfWeek.TUE, mouse);
        itemsPurchased.put(DaysOfWeek.WEN, milk);
        itemsPurchased.put(DaysOfWeek.FRY, bread);
        itemsPurchased.put(DaysOfWeek.SAT, rice);
        itemsPurchased.put(DaysOfWeek.SUN, charger);

        System.out.println("**************Items bought********************");
        System.out.println(itemsPurchased);




    }

}

