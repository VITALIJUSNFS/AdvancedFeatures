package encapsulation;

public class Main {
    /*
    unit testai
     */
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Bob");
        person.setPersonalNumber(123123654);
        System.out.println(person);

        person.setName("L");
        person.setPersonalNumber(-15);
        System.out.println(person);
    }
}
