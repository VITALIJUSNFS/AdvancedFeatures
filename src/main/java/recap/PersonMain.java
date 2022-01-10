package recap;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        //Person person = new Person(); - abstrakcios klases objektu kurti negalime

        Programmer programmerJohn = new Programmer("John",21);
        programmerJohn.setLevel(ExpirienceLevel.MIDDLE);
        programmerJohn.work();
        programmerJohn.breathe();
        programmerJohn.setUpIntellij();
        System.out.println(programmerJohn);

        System.out.println("****************");

        Person javaDeveloper = new Programmer("Tim", 35);
        Person pizzMaker = new Baker("Bob",22);

        List<Person> people = new ArrayList<>();
        people.add(javaDeveloper);
        people.add(pizzMaker);
        people.add(programmerJohn);

        for (Person person: people){
            System.out.println(person.toString());
            person.breathe();
            person.work();
            person.payTaxes();

        }



    }
}
