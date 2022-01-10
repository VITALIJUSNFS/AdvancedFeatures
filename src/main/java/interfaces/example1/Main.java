package interfaces.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Swedbank swedbank = new Swedbank();
        Customer customer = new Customer(11);
        System.out.println(swedbank.calculatedBankMargin(customer));
        swedbank.consultCustomers();

        Snoras snoras = new Snoras();
        System.out.println(snoras.calculatedBankMargin(customer));
        snoras.consultCustomers();
        snoras.goBankrupt();

        List<EuropeanCentralBank> lietuvosBankai = new ArrayList<>();
        lietuvosBankai.add(swedbank);
        lietuvosBankai.add(snoras);

        System.out.println("*----------*");
        for (EuropeanCentralBank bank: lietuvosBankai){
            bank.consultCustomers();
        }
    }
}
