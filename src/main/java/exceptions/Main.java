package exceptions;

public class Main {
    public static void main(String[] args) {

        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Is nulio dalint negalima, nutiko klaida" + '\n' + e.getMessage());
        } finally {
            System.out.println("Vykdysim visada ar bus klaida ar ne");
        }

        System.out.println("**************" + '\n' + "Programa vyksta toliau");

    }
}
