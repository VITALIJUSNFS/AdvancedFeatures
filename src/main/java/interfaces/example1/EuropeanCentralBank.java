package interfaces.example1;

public interface EuropeanCentralBank {

    double calculatedBankMargin(Customer customer);
    void consultCustomers();

    default  double getEuribor(){
        return 0.01;
    }
}
