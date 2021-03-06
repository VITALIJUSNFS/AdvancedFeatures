package advanceCoding.exercise1;

import advanceCoding.exercise1.frame.AirPlane;
import advanceCoding.exercise1.frame.Player;
import advanceCoding.exercise1.frame.PopulateDataService;
import advanceCoding.exercise1.frame.SearchService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // PopulateDataService.prepareData() - - CTRL+ALT+V
        List<AirPlane> airPlanes = PopulateDataService.prepareData();

        for (AirPlane airPlane : airPlanes) {
            System.out.println("Lektuvas " + airPlane.getCompanyName());
            System.out.println("Vietu skaicius " + airPlane.getSeatCount());
            System.out.println(airPlane. getSpeed());
            System.out.println("*************");
            System.out.println("Komanda " + airPlane.getTeam().getName() + "Salis " + airPlane.getTeam().getCountry());
            System.out.println(airPlane.getTeam().getCoach().getLastName());
            System.out.println("*****************");
            for (Player player:airPlane.getTeam().getPlayers()) {
                System.out.println(player);

            }
            System.out.println("**************************************************************");
        }

//        System.out.println("/** " +
//                "/**\n" +
//                " * 1. Surasti lektuva, kuriame skrenda Jasikevicius\n" +
//                " * 2. Surasti visus trenerius, kurie yra pikti :)\n" +
//                " * 3. Surasti lektuve esancias komandas, kuriu pavadinimai ilgesni nei 5 raides.\n" +
//                " * 4. Surasti lektuva, kurio greitis didesnis nei 1000\n" +
//                " * 5. Surasti komanda, kuri turi daugiau zaideju.\n" +
//                " * 6. Surasti komanda, kuri turi daugiau patirties (sumuoti zaideju patirtis)\n" +
//                " * 7. Surasti brangiausia komandos zaideja.\n" +
//                " * 8. Surasti visus zaidejus is visu komandu, kurie yra is USA\n" +
//                " * 9. Isrinkti is visu komandu zaidejus, kurie turi THREE_POINT_SHOOTER igudi\n" +
//                " * 10. Apkeisti komandu trenerius.\n" +
//                " */");

        SearchService searchService = new SearchService();

        System.out.print("1. Lektuvas, kuriame skrenda Jasikevicius:  ");
        System.out.println(searchService.findPlane("Jasikevicius",airPlanes));

        System.out.println("2. Treneriai, kurie yra pikti : ");
        System.out.println(searchService.findCoaches(airPlanes));

        System.out.print("3. Pavadinimai ilgesni nei 5 raides");
        System.out.println(searchService.findTeams(airPlanes));

        System.out.print("4. Speed over 1000 km/h: ");
        System.out.println(searchService.speedOver1000(airPlanes));

        System.out.print("5. komanda, kuri turi daugiau zaideju.: ");
        System.out.println(searchService.biggestTeam(airPlanes).getName());

        System.out.print("6. Surasti komanda, kuri turi daugiau patirties (sumuoti zaideju patirtis) ");
        System.out.println(searchService.biggestTeamExperience(airPlanes));

        System.out.print("7. Surasti brangiausia komandos zaideja.: ");
        System.out.println(searchService.mostExpensivePlayer(airPlanes));

        System.out.print("8. Surasti visus zaidejus is visu komandu, kurie yra is USA ");
        System.out.println(searchService.playersFromUSA(airPlanes));

        System.out.print("9. Isrinkti is visu komandu zaidejus, kurie turi THREE_POINT_SHOOTER igudi: ");
        System.out.println(searchService.skillMoveShooter(airPlanes));

        System.out.print("10. Apkeisti komandu trenerius ");
        System.out.println(searchService.skillMoveShooter(airPlanes));

    }
}
