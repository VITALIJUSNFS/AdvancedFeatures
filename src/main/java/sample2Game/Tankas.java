package sample2Game;
public class Tankas extends TransportoPriemone {

    private boolean turiViksrus;
    private int kulkuSkaicius;

    /**
     * Specifinis tanko elgesys budingas tik tankui ir niekam kitam (nebent kazkas dar tanka paveldes)
     */
    public void saukIsPabuklo() {
        System.out.println("Saunu!");
    }

    public void setTuriViksrus(boolean turiViksrus) {
        this.turiViksrus = turiViksrus;
    }

    public void setKulkuSkaicius(int kulkuSkaicius) {
        this.kulkuSkaicius = kulkuSkaicius;
    }

    public boolean getTuriViksrus() {
        return turiViksrus;
    }

    public int getKulkuSkaicius() {
        return kulkuSkaicius;
    }
}