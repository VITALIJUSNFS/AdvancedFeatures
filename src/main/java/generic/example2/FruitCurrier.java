package generic.example2;

public class FruitCurrier <T extends Fruit> {

    T fruit;

    public FruitCurrier(T fruit) {
        this.fruit = fruit;
    }

    public void carryFruit(){
        System.out.println("Carrying " + fruit.name);
    }

}
