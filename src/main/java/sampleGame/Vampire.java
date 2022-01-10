package sampleGame;

public class Vampire extends Monster {
    public void drinkBlood() {
        System.out.println("Drinking blood");
    }

    @Override
    public void attack() {
        System.out.println("Attacking like Vampire");
    }

}
