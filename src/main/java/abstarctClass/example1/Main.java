package abstarctClass.example1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lektuvas lektuvas = new Lektuvas(1000);
        Automobilis automobilis = new Automobilis( 180);
        MotorineValtis motorineValtis = new MotorineValtis( 60);

        List<TransportoPriemone> transportoPriemones = List.of(lektuvas, automobilis, motorineValtis);

        for (TransportoPriemone transportoPriemone :transportoPriemones){
            transportoPriemone.turnOnEngine();
            transportoPriemone.move();
            System.out.println();
        }

    }
}
