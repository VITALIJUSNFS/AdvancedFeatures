package advanceCoding.exercise1.frame;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data //setteriai getteriai to string constructors
@AllArgsConstructor //konstruktorius su visais aargumentais

public class Team {

    private String name;
    private String country;
    private List<Player> players;
    private Coach coach;

    public Coach getCoach() {
        return coach;
    }
}
