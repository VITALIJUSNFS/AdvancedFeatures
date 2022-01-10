package interfaces.example1;

public class Snoras implements EuropeanCentralBank {
    @Override
    public double calculatedBankMargin(Customer customer) {
        return customer.getCreditScore() > 20 ? 2.89 + getEuribor() : 2.11 + getEuribor();
    }

    @Override
    public void consultCustomers() {
        System.out.println("Snoras konsultuoja tik gavai.");


    }

    public void goBankrupt() {
        System.out.println("Bankrotuoju. Ate!");
    }
}
