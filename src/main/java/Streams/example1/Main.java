package Streams.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Human> humans = constructPersonList();

        List<String> pilnameciai = new ArrayList<>();
        for (Human human : humans) {
            if (human.getAge() >= 18) {
                pilnameciai.add(human.getName());
            }
        }
        System.out.println(pilnameciai);
        //ctrl + shift

        List<String> pilnameciaiSuStream = humans.stream()
                .filter(human -> human.getAge() >= 18) //isfiltruoti pinameciai
                .map(human -> human.getName())
                .collect(Collectors.toList());
        System.out.println();

        humans.stream().filter(human -> human.getAge() < 18)
                .map(human -> human.getName())
                .forEach(System.out::println); //name -> System.out.println(name) == System.out::println

        System.out.println(pilnameciaiSuStream);

        //isrinkti zmones, kurie yra tarp 19- 65 metu, kuriu vardai ne null ir kuriu vardau prasideda raide B.

        System.out.println("*******");
        //Impeerative approach, we specify every implementation detail
        for (Human human : humans) {
            if (human.getAge() > 18 && human.getAge() < 65 && human.getName() != null && human.getName().startsWith("B")) {
                System.out.println(human.getName());
            }
        }
        System.out.println("/////****/////");
        for (Human human : humans) {
            if (human.getAge() > 18 && human.getAge() < 65) {
                if (human.getName() != null & human.getName().startsWith("B")) {
                    System.out.println(human.getName());
                }
            }
        }
        System.out.println("**** stream pvz **** ->");
        humans.stream()
                .filter(human -> human.getAge() > 18)
                .filter(human -> human.getAge() < 65)
                .filter(human -> human.getName() != null)
                .filter(human -> human.getName().startsWith("B"))
                .forEach(human -> System.out.println(human.getName()));

        System.out.println(" sample with siblings");

        for (Human human : humans) {
            for (Human sibling : human.getSiblings()) {
                if (sibling.getGender().equals("M") && sibling.getAge() > 10 && sibling.getAge() < 65 && sibling.getName() != null && sibling.getName().startsWith("J")) {
                    System.out.println(sibling.getName());
                }
            }
        }
        System.out.println("*****Streams sample for siblings****");
        humans.stream()
                .flatMap(human -> human.getSiblings().stream())
                .filter(human -> human.getGender().equals("M"))
                .filter(human -> human.getAge() > 10)
                .filter(human -> human.getAge() < 65)
                .filter(human -> human.getName() != null)
                .filter(human -> human.getName().startsWith("J"))
                .forEach(human -> System.out.println(human.getName() + " " + human.getGender() + " " + human.getAge()));


    }


    private static List<Human> constructPersonList() {

        Human siblingJohn = new Human("John", 12, "M", Collections.emptyList());
        List<Human> bradsSiblings = new ArrayList<>();
        bradsSiblings.add(siblingJohn);

        Human siblingAnn = new Human("Ann", 16, "F", Collections.emptyList());
        List<Human> tomsSiblings = new ArrayList<>();
        tomsSiblings.add(siblingAnn);

        Human siblingPeter = new Human("Peter", 9, "M", Collections.emptyList());
        Human siblingJimmy = new Human("Jimmy", 11, "M", Collections.emptyList());
        List<Human> judysSiblings = new ArrayList<>();
        judysSiblings.add(siblingJimmy);
        judysSiblings.add(siblingPeter);

        List<Human> people = new ArrayList<>();
        people.add(new Human("Brad", 19, "M", bradsSiblings));
        people.add(new Human("Tom", 17, "M", tomsSiblings));
        people.add(new Human("Judy", 21, "F", judysSiblings));
        return people;
    }
}
