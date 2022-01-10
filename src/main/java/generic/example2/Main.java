package generic.example2;

public class Main {

    public static void main(String[] args) {

        Fruit apple = new Apple("Obuolys");
        Fruit banana = new Banana("Banana");
        FruitCurrier fruitCurrier = new FruitCurrier(apple);
        fruitCurrier.carryFruit();
        fruitCurrier.fruit = banana;
        fruitCurrier.carryFruit();

        //fruitCurrier.fruit = new TV(); jei TV nera fruit, mes nevezam
    }
}
