package advanceCoding.exercise1.frame;

import java.util.ArrayList;
import java.util.List;

public class SearchService {

    public String findPlane(String coachLastName, List<AirPlane> airPlanes) {

        String companyName = null;

        for (AirPlane airPlane : airPlanes) {
            if (airPlane.getTeam().getCoach().getLastName().equalsIgnoreCase(coachLastName)) {
                companyName = airPlane.getCompanyName();
            }
        }
        return companyName;
    }

    public List<Coach> findCoaches(List<AirPlane> airPlanes) {

        List<Coach> angryCoachList = new ArrayList<>();
        for (AirPlane airPlane : airPlanes) {
            if (airPlane.getTeam().getCoach().isAngry()) {
                angryCoachList.add(airPlane.getTeam().getCoach());
            }
        }
        return angryCoachList;
    }

    public List<String> findTeams(List<AirPlane> airPlanes) {

        List<String> teams5Long = new ArrayList<>();

        for (AirPlane airPlane : airPlanes) {
            if (airPlane.getTeam().getName().length() > 5) {
                teams5Long.add(airPlane.getTeam().getName());
            }
        }
        return teams5Long;

    }

    public List<String> speedOver1000(List<AirPlane> airPlanes) {
        List<String> speedOver1000 = new ArrayList<>();

        for (AirPlane airPlane : airPlanes) {
            if (airPlane.getSpeed() > 1000) {
                speedOver1000.add(airPlane.getCompanyName());
            }
        }
        return speedOver1000;
    }

    public Team biggestTeam(List<AirPlane> airPlanes) {

        int biggestTeam = 0;
        for (AirPlane airPlane : airPlanes) {

            if (airPlane.getTeam().getPlayers().size() > biggestTeam) {
                biggestTeam = airPlane.getTeam().getPlayers().size();
            }
        }
        for (AirPlane airPlane : airPlanes) {
            if (airPlane.getTeam().getPlayers().size() == biggestTeam) {
                return airPlane.getTeam();
            }
        }
        return null;

    }

    public String biggestTeamExperience(List<AirPlane> airPlanes) {

        int experience = 0;
        String teamName = null;


        for (AirPlane airPlane : airPlanes) {
            List<Player> players = airPlane.getTeam().getPlayers();
            int countExperience = 0;
            for (Player player : players) {
                countExperience += player.getExperience();

            }
            if (experience < countExperience) {
                experience = countExperience;
                teamName = airPlane.getTeam().getName();
            }
        }
        return teamName;
    }

    public String mostExpensivePlayer(List<AirPlane> airPlanes) {
        double expensivePlayer = 0;
        String playerName = null;

        for (AirPlane airPlane : airPlanes) {

            List<Player> players = airPlane.getTeam().getPlayers();
            for (Player player : players) {
                if (player.getSalary() > expensivePlayer) {
                    expensivePlayer = player.getSalary();
                    playerName = player.getFirstName() + " " + player.getLastName();
                }
            }
        }
        return playerName;
    }

    public List<Player> playersFromUSA(List<AirPlane> airPlanes) {
        List<Player> players = new ArrayList<>();

        for (AirPlane airPlane : airPlanes) {
            for (Player player : airPlane.getTeam().getPlayers()) {
                if (player.getNationality().equalsIgnoreCase("USA")) {
                    players.add(player);
                }
            }
        }
        return players;
    }

    public List<Player> xxx (List<AirPlane> airPlanes) {

    }

}
