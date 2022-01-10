package exerciseEncapsulation;

public class PocketTest {
    int money;

    public int getMoney() {
        if (money <= 10) {
            return 0;
        } else {
            return money;
        }
    }

    @Override
    public String toString() {
        return "Money{" +
                "money=" + money +
                '}';
    }

    public void setMoney(int money) {

        if (money >= 0 || money < 3000) {
            this.money = money;
        }
    }
}


//    public void setName(String name) {
//        if (name.length() > 2) {
//            this.name = name;
//        } else {
//            System.out.println("Name too short");
//        }