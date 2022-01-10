package collection.savarankiskasDarbas;

import java.util.*;

public class PirkiniuSarasas {
    public static void main(String[] args) {

//        List<String> produktai = new ArrayList<>();
        Set<String> produktai = new HashSet<>();
//        Set<String> produktai = new LinkedHashSet<>();

        produktai.add("Bananas");
        produktai.add("Rastas");

        produktai.add("Obuolys");
        produktai.add("Pienas");
        produktai.add("Suris");
        produktai.add("Duona");
        produktai.add("Zuvis");
        produktai.add("Mesaa");
        produktai.add("Varske");
        produktai.add("Saldainiai");

        for (String s : produktai) {
            System.out.println(s);
        }


//        int numeris = 1;
//
//        for (String produktas : produktai) {
//            System.out.println(numeris+". " +produktas );
//            numeris++;
        }

    }

