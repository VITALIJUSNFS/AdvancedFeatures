package Streams.example3;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DeviceHelper deviceHelper = new DeviceHelper();
        List<Device> myDevices = deviceHelper.constructPredefinedDeviceList();

        for (Device myDevice : myDevices) {
            if (myDevice.getQuantity() > 5) {
                if (myDevice.getPrice() > 500) {
                    if (myDevice.getName() != null && myDevice.getName().startsWith("C")) {
                        for (Store store : myDevice.getAvailableStores()) {
                            if (store.getAddress() != null && store.getAddress().startsWith("U")) {
                                System.out.println(myDevice);
                            }
                        }
                    }
                }
            }
        }

        System.out.println(" *** Streams sample ***");
        myDevices.stream()
                .filter(device -> device.getQuantity() > 5)
                .filter(device -> device.getPrice() > 500)
                .filter(device -> device.getName() != null)
                .filter(device -> device.getName().startsWith("C"))
                .flatMap(device -> device.getAvailableStores().stream())
                .filter(store -> store.getName() != null)
                .filter(store -> store.getAddress().startsWith("U"))
                .forEach(System.out::println);


    }
}
