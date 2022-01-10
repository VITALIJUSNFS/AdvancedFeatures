package abstruction;

public class Main {
    public static void main(String[] args) {


        Iphone iphone7 = new Iphone("Iphone 7 Series");
        Samsung samsung10 = new Samsung("Samsing10");
        Motorola motorola = new Motorola("Razor");

        PhoneRepairService phoneRepairService = new PhoneRepairService();

        phoneRepairService.repair(iphone7);
        phoneRepairService.repair(samsung10);


        Nokia nokia = new Nokia("3310");

    }

}
