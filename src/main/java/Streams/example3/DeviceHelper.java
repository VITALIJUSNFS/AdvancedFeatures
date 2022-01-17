package Streams.example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeviceHelper {

    public List<Device> constructPredefinedDeviceList() {

        Store topocentras = new Store("Topocentras", "Rinktines g. 5");
        Store electromarkt = new Store("electromarkt", "Ateiviu g. 7");
        Store senukai = new Store("senukai", "Ukmerges g. 9");
        Store lidl = new Store("lidl", "Vokieciu g. 12");

        List<Store> firstStoreRegion = Arrays.asList(topocentras, lidl);
        List<Store> secondStoreRegion = Arrays.asList(senukai, electromarkt);


        List<Device> devices = new ArrayList<>();
        devices.add(new Device("Phone", 1000, 5, firstStoreRegion));
        devices.add(new Device("TV", 600, 11, secondStoreRegion));
        devices.add(new Device("Fridge", 820, 22, firstStoreRegion));
        devices.add(new Device("Computer", 1200, 9, secondStoreRegion));
        devices.add(new Device("CD player", 150, 30, firstStoreRegion));
        devices.add(new Device("Dishwasher", 750, 2, secondStoreRegion));

        return devices;
    }
}
