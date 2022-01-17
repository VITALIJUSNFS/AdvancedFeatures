package Streams.example3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

class Device {
    private String name;
    private int price;
    private int quantity;
    private List<Store> availableStores;
}

