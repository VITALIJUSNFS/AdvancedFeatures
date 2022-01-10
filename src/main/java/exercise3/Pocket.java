package exercise3;

public class Pocket {

    private double money;

    public Pocket(double money) {
        this.money = money;
    }

    public double showMoney() {
        return money;
    }

    public void addMoney(double moneyToAdd) {
        if (moneyToAdd <= 0) {
            System.out.println("You can't add negative");
        } else if (moneyToAdd >= 3000) {
            System.out.println("Pocket too small");
        } else {
            money = money + moneyToAdd;
            System.out.println("You added: " + moneyToAdd);
        }
    }

    public void takeOutMoney(double moneyAmount) {
        if (moneyAmount < money && moneyAmount >= 10) {
            money = money - moneyAmount;
            System.out.println("Withdrawal" + moneyAmount);
        } else {
            System.out.println("Failed");
        }

    }

}
