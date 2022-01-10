package abstarctClass.sampletest;

import java.util.ArrayList;
import java.util.List;

/*
Sukurti abstract class Device, kuri turetu ir abstraktu ir konkretu metoda ir keleta lauku.
Sukurti keleta konkreciu klasiu, kuriuos praplestu ta abstrakcia klase.
Main klaseje sukurti keleta Device tipo objektu, juos sudeti i sarasa.
Ciklo pagalba istestuoti skirtingus device metodu veikimus.
 */
public class AbstractExercise {
    public static void main(String[] args) {

        TV tv = new TV();
        Radio radio = new Radio();
        Fridge fridge = new Fridge();

        System.out.println(tv.name + tv.power);
        System.out.println(radio.name + radio.power);
        System.out.println(fridge.name + fridge.power);

        System.out.println("******");
        List<devices> device1 = new ArrayList<>();
        device1.add(tv);
        device1.add(radio);
        device1.add(fridge);

        tv.Cinema();
        tv.isOn();
        radio.Sub();
        radio.isOn();
        fridge.Heating();
        fridge.isOn();

        for (devices device : device1) {
            System.out.println(device);
        }

    }

}

abstract class devices {
    String name;
    String power;

    abstract void isOn();

    @Override
    public String toString() {
        return "devices{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}

class TV extends devices {

    @Override
    void isOn() {
        System.out.println("TV is showing ..");
    }

    void Cinema() {
        System.out.println("TV in 3D mode");
    }
}

class Radio extends devices {

    boolean isPortable;

    @Override
    void isOn() {
        System.out.println("Playing music ..");
    }

    void Sub() {
        System.out.println("Suboofer is on");
    }
}

class Fridge extends devices {

    @Override
    void isOn() {
        System.out.println("freezing ..");
    }

    void Heating() {
        System.out.println("Fridge in heating mode ...");
    }
}


