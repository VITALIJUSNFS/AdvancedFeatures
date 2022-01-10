package exerciseEncapsulation;

public class Main {

    public static void main(String[] args) {

        ClassDogExercise classDogExercise = new ClassDogExercise("Holly", 12, "Chihuahua", "male",
                4);
        ClassDogExercise classDogExercise1 = new ClassDogExercise("boxer","male");
        System.out.println(classDogExercise);
        System.out.println(classDogExercise1);

        System.out.println("******* after change");
        classDogExercise.setAge(0);
        classDogExercise.setWeight(0);
        System.out.println(classDogExercise);

        System.out.println("**********Money");
        PocketTest money = new PocketTest();
        money.setMoney(50);
        System.out.println(money);



    }
}
