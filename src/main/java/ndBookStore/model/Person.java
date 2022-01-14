package ndBookStore.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class Person {
    private long id; //unikalus numeris
    private String name;
    private int age;

}
