package abstarctClass.example2;

import java.util.ArrayList;
import java.util.List;

public class AbstractMain {

    public static void main(String[] args) {
        //Animal animal = new Animal(); //Negalima sukurti abstrakcijos klase objekto
        Duck duck = new Duck();
        Dog dog = new Dog();

        Animal anotherDuck = new Duck();

        System.out.println(duck.age + duck.name+ duck.hasFeathers);
        System.out.println(dog.age+ dog.name);
        System.out.println(anotherDuck.age+anotherDuck.name);//hasFeathers negalima pasiekti konkrecios Duck lauko

        duck.move();
        duck.fly();
        duck.breathe();

        dog.move();
        dog.breathe();
        dog.bark();

        anotherDuck.move();
        anotherDuck.breathe();
        //anotherDuck.fly() - negaliu pasiekti , nes budingas tik duck klasei

        System.out.println("*****");
        List<Animal> gyvunai = new ArrayList<>();
        gyvunai.add(duck);
        gyvunai.add(anotherDuck);
        gyvunai.add(dog);

        System.out.println("*****");
        gyvunai.forEach(Animal::move);
        gyvunai.forEach(Animal::breathe);


    }
}

abstract class Animal{
    int age;
    String name;

    abstract void move(); // abstraktus metodas, visi gyvunai juda bet savaip

    void breathe(){ //turi kuna, visi gyvunai kviepuoja vienodai
        System.out.println("Breathing...");
    }
}

class Duck extends Animal{

    boolean hasFeathers; // specifinis antino bruozas

    @Override
    void move() {
        System.out.println("Swimming .....");
    }
    void fly(){
        System.out.println("Only duck can fly..");
    }
}

class Dog extends Animal{

    @Override
    void move() {
        System.out.println("Running ...");
    }
    void bark(){
        System.out.println("Only dog can bark ..");
    }
}