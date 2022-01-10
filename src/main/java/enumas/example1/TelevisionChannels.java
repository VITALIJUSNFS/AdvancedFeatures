package enumas.example1;

public enum TelevisionChannels {
    TV3(3, 1.99, "TV3 Kanalas"),
    LNK(2, 1.49, "LNK Go"),
    BTV(4, 2.99, "BTV Premium");

    //gera praktika enume laukus kurti kaip final, kad niekas nepakeistu reiksmes.
    final int channelNumber;
    final double monthlyPrice;
    final String channelName;

    TelevisionChannels(int channelNumber, double monthlyPrice, String channelName) {
        this.channelNumber = channelNumber;
        this.monthlyPrice = monthlyPrice;
        this.channelName = channelName;
    }

    @Override
    public String toString() {
        return "TelevisionChannels{" +
                "channelNumber=" + channelNumber +
                ", monthlyPrice=" + monthlyPrice +
                ", channelName='" + channelName + '\'' +
                '}';
    }
}