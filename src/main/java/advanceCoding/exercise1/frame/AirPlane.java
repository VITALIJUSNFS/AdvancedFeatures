package advanceCoding.exercise1.frame;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AirPlane {

    private String companyName;
    private int seatCount;
    private Team team;
    private int speed;
}
