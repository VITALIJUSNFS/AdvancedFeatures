package enumas.example1;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.SESTADIENIS;
        System.out.println(day);

        for (DaysOfWeek singleDay : DaysOfWeek.values()) {
            System.out.print("  "+ singleDay);


        }
        System.out.println();
        System.out.println("*****************************");

        boolean isOrderReceived = true;
        if (isOrderReceived) {
            PizzaStatus status = PizzaStatus.ORDERED;
            int pizzaStatus = 1; //turiu zinoti, kad 1 reiskia uzsakyta..
            makePizza(pizzaStatus);
            //....
        }

        System.out.println(TelevisionChannels.BTV.channelNumber);

        for (TelevisionChannels valucurrentChabbel : TelevisionChannels.values()) {
            System.out.println(valucurrentChabbel);

        }

        int userChannelSelection = 4;
        if (userChannelSelection == TelevisionChannels.BTV.channelNumber) {
            System.out.println("Ijungiam BTV");
            System.out.println("Kanalo kaina: " + TelevisionChannels.BTV.monthlyPrice);
        }

        System.out.println('\n'+"Autoparkas");
        for (AutoParkas numeris : AutoParkas.values()) {
            System.out.println(numeris +" "+ numeris.brand + " " + numeris.regNo + " " + numeris.cost);

        }

    }

    private static void makePizza(int pizzaStatus) {
        System.out.println("Pizza is made");
        pizzaStatus = 2; //turiu zinoti, kad 2 reiskia pagaminta pica

    }

}

