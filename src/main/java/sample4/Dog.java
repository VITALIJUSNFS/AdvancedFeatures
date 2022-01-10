package sample4;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
// Perrasau ant virsaus
    @Override
    public void makeSound() {
            System.out.println("Woof Woof");
        }

        public  void growl(){
            System.out.println("Grrrr...");

    }
}
