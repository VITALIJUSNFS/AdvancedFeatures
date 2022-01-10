package exercise3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PocketTest {

    @AfterEach


    @Test
    void testShowMoney() {
        //given
        Pocket pocket = new Pocket(100);
        double currentMoney = pocket.showMoney();
        assertEquals(100,currentMoney);
    }

    @Test
    void testAddMoney() {
        Pocket pocket = new Pocket(100);
        pocket.addMoney(50);
        double actualMoneyInPocket = pocket.showMoney();
        assertEquals(150, actualMoneyInPocket);
    }

    @Test
    void takeOutMoney() {
        Pocket pocket = new Pocket(50);
        pocket.takeOutMoney(20);
        assertEquals(30, pocket.showMoney());
    }
}