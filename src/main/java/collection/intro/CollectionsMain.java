package collection.intro;

import java.util.*;

public class CollectionsMain {

    public static void main(String[] args) {

        System.out.println("*****LIST****");
        List<String> vardai = new ArrayList<>();
        vardai.add("Tomas");
        vardai.add("Darius");
        vardai.add("Lina");

        for (String vardas : vardai) {
            System.out.println(vardas);
            // islaikyta eiles tvarka
        }
        System.out.println("*****SET****");

        Set<String> klasiokai = new HashSet<>();
        klasiokai.add("Lina");
        klasiokai.add("Darius");
        klasiokai.add("Lina");
        klasiokai.add("Paulius");
        klasiokai.add("Gintas");
        klasiokai.add("Tadas");


        //Set neislaiko eiliskuma ir

        for (String klasiokas : klasiokai) {
            System.out.println(klasiokas);
        }
        System.out.println(klasiokai);

        System.out.println("*/");

        Phone iphone = new Phone("Iphone X");
        Phone samsung = new Phone("Samsung D");

        Map<String, Phone> telefonai = new HashMap<>();
        telefonai.put("iphonas", iphone);
        telefonai.put("samsungas", samsung);

        System.out.println(telefonai);

        for (String raktas : telefonai.keySet()) {
            System.out.println(raktas);

            for (String reiksme : telefonai.keySet()) {
                System.out.println(reiksme);



            }
            System.out.println();

            for (Map.Entry<String, Phone> stringPhoneEntry : telefonai.entrySet()) {
                System.out.println(stringPhoneEntry.getKey() + " -> " + stringPhoneEntry.getValue());
            }
        }

    }
}

    class Phone{
        @Override
        public String toString() {
            return "Phone{" +
                    "brand='" + brand + '\'' +
                    '}';
        }

        private String brand;

        public Phone (String brand){
            this.brand = brand;
    }
}
