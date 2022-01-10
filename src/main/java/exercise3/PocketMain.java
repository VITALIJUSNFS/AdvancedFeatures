package exercise3;

public class PocketMain {
    public static void main(String[] args) {
        Pocket kisene = new Pocket(500);
        System.out.println("I have : " + kisene.showMoney());

        kisene.addMoney(52);
        System.out.println("I have : " + kisene.showMoney());

        kisene.takeOutMoney(152);
        System.out.println(kisene.showMoney());

    }
}
