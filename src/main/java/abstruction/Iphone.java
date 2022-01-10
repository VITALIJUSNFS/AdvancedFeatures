package abstruction;

import lombok.Data;

@Data

public class Iphone {
    String name;

    public Iphone(String name) {
        this.name = name;
    }
}
