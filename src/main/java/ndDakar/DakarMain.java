package ndDakar;

import java.util.*;

public class DakarMain {

    public static void main(String[] args) {

        Team gasGasFactory = new Team("GASGAS FACTORY RACING");
        Team teltonika = new Team("TELTONIKA RACING");

//        Team teltonika = new Team();
//        teltonika.setName("TELTONIKA RACING");

        Bike bike1 = new Bike("Kawasaki", 185, 2);
        Bike bike2 = new Bike("Yamaha", 195, 2);
        Bike bike3 = new Bike("BMW", 175, 2);

        Trucks trucks1 = new Trucks("Volvo", 130, 6);
        Trucks trucks2 = new Trucks("Tatra", 125, 6);
        Trucks trucks3 = new Trucks("Renault", 115, 6);

        SUV suv1 = new SUV("BMW", 190, 4);
        SUV suv2 = new SUV("TOYOTA", 190, 4);
        SUV suv3 = new SUV("", 190, 4);

        Driver samSunderland = new Driver("SAM", "SUNDERLAND", Country.GBR.name(),
                ExperienceLevel.BEGINNER.name(), 2500);
        Driver pabloDiablo = new Driver("Pablo", "Diablo", Country.USA.name(),
                ExperienceLevel.GURU.name(), 3500);

        Navigator ArturasNavi = new Navigator("Arturas", "Navi", Country.LTU.name(),2000);
        Navigator MaxLove = new Navigator("Arturas", "Navi", Country.USA.name(), 2000);

        Map<Team,Trucks> team1T = new HashMap<>();
        team1T.put(teltonika,trucks1);

        System.out.println(team1);




    }
}
