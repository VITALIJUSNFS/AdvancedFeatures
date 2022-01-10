package sample3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void  testPerson(){
        Actor actor = new Actor("Jim Carrey");
        Waiter waiter = new Waiter(" Boll Klk");
        assertThat(actor).isInstanceOf(Person.class);
        assertThat(waiter).isNotInstanceOf(Vehicle.class);
    }

}