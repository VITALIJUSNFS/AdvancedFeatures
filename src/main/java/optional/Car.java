package optional;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data

public class Car {


    private String name;


    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
