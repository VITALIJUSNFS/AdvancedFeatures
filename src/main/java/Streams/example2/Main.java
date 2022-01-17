package Streams.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // **  Stream reprezentuoja elementu seka (srove) / stream
        // Lanksciau ir operatyviau veikti su collections

        List<String> klasiokai = new ArrayList<>();
        klasiokai.add("Darius");
        klasiokai.add("Paulius");
        klasiokai.add("Donatas");
        klasiokai.add("Romas");
        klasiokai.add("Auta");

        //1. Sarasa paverciam i stream
        //2. sorted stream pagal abecele
        //3. find first surandame pirma elementa, isrusiuoja ir grazina optional
        //4. ifPresent patikrina ar elementas yra ir ji atspausdina

        klasiokai.stream().sorted().findFirst().ifPresent(System.out::println);

        List<String> vardaiIsARaides = klasiokai.stream()
                .sorted()
                .filter(vardas->vardas.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(vardaiIsARaides);

        int[] skaiciai = {5, 6, 4, 5, 6, 7, 5, 8, 10};

        Arrays.stream(skaiciai)
                .map(skacius -> skacius * 5).
                max().
                ifPresent(System.out::println);


    }

}
