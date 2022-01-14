package abstarctClass.example3;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        RadioLight radioLight= new RadioLight();
        radio.play();
        radio.play("Jodo sing", 25);
        System.out.println("******RadioLightOn");
        radio.turnOn();
        radioLight.turnOn();
    }
}
