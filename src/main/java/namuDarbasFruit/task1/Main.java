package namuDarbasFruit.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Orange orange = new Orange("Nice Bananas", 1.99, 150,Countries.SPAIN);
        Watermelon watermelon = new Watermelon("Watermelon", 1.32,250,Countries.SPAIN);
        Banana banana = new Banana("Banana", 1.4, 452, Countries.POLAND);

        List<Fruit> vaisiai = new ArrayList<>();
        vaisiai.add(orange);
        vaisiai.add(watermelon);
        vaisiai.add(banana);

        FruitShippingService service = new FruitShippingService();

        orange.printLabelInformation();
        watermelon.printLabelInformation();
        banana.printLabelInformation();

        service.shipFruit(orange);
        service.shipFruit(banana);
        service.shipFruit(watermelon);


        System.out.println("********");
        for (Fruit fruit : vaisiai) {
            service.shipFruit(fruit);
        }

//        System.out.println("----------");
//        for (int i = 0; i < vaisiai.size(); i++) {
//            service.shipFruit(vaisiai);
//        }

        System.out.println("----------");
        vaisiai.forEach(service::shipFruit);


    }
}
