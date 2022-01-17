package Streams.mockJsonTutorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int salary;
}