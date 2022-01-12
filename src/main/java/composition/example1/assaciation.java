package composition.example1;

public class assaciation {
    public static void main(String[] args) {
        Heart heart = new Heart();
        heart.beat();
        heart.heartRate = 75;
        heart.size = 20;

        BionicArm bionicArm = new BionicArm();
        bionicArm.turnOn();

        Person person = new Person();
        person.bionicArm = bionicArm;
        person.heart = heart;

    }
}

class Person {
    Heart heart; //Composition stiprus loginis rysys
    Brain brain; //Composition stiprus loginis rysys
    BionicArm bionicArm; //Aggregation silpnas loginis rysys
}

class BionicArm {
    int weight;

    void turnOn() {

    }
}

class Heart {
    int heartRate;
    int weight;
    int size;

    void beat() {

    }
}
class Brain {
    int size;
    void think() {
    }
}

