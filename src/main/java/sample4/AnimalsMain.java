package sample4;

import java.util.ArrayList;
import java.util.List;

public class AnimalsMain {
    public static void main(String[] args) {
        System.out.println("************************");
        Dog rexas = new Dog("Rexas");
        rexas.makeSound();
        rexas.growl();
        rexas.getName();
        rexas.breath();

        System.out.println("************************");
        Cat murkis = new Cat("Murkis");
        murkis.makeSound();
        murkis.purr();
        murkis.getName();
        murkis.breath();

        System.out.println("************************");
        Duck jonis = new Duck("Jonis");
        jonis.makeSound();
        jonis.fly();
        jonis.getName();
        jonis.breath();

//        List<Dog> dogs = new ArrayList<Dog>();
//        List<Cat> cats = new ArrayList<Cat>();
//        dogs.add(rexas);
//        cats.add(murkis);
//        // dogs.add(kleopatra) -
//        System.out.println(rexas instanceof murkis);

        List<Animal> animals = new ArrayList<>();
        animals.add(rexas);
        animals.add(murkis);
        animals.add(jonis);

        System.out.println("***************");
        for (Animal animal :animals) {
            animal.makeSound();
            if (animal instanceof Duck){
                ((Duck) animal).fly();
            }
        }

    }
}
