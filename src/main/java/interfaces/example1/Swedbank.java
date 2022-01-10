package interfaces.example1;

public class Swedbank implements EuropeanCentralBank {

    @Override
    public double calculatedBankMargin(Customer customer) {

        return customer.getCreditScore() > 10 ? 1.49 + getEuribor() : 1.99 + getEuribor();

//        if (customer.getCreditScore() > 10) {
//            return 1.49 + getEuribor();
//        }
//        return 1.99;
    }

    @Override
    public void consultCustomers() {
        System.out.println("Swedbankas konsultoja klientus online");

    }
}
