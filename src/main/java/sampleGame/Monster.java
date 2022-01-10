package sampleGame;

    //tai yra tevine klase - parent class, super class or base class
    public class Monster {

        private int healthPoint;

        public void talk() {
            System.out.println("I am a monster");
        }

        public void attack() {
            System.out.println("Attacking as a monster");
        }

        public int getHealthPoint() {
            return healthPoint;
        }

        public void setHealthPoint(int healthPoint) {
            this.healthPoint = healthPoint;
        }
    }

