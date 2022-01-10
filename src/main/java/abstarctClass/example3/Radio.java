package abstarctClass.example3;

public class Radio extends Device{
    @Override
    public void turnOn() {
        System.out.println("Radio On");
    }

    public void play(){
        System.out.println("Radio is playing");
    }
    //Metodo overloaingas (perkrovimas skirtingu parametru kiekiu
    public void play(String song){
        System.out.println("Radio is playing song" + song);
    }

    public void play(String song, int volume){
        play(song);
        System.out.println("Current volume is" + volume);
    }

}
