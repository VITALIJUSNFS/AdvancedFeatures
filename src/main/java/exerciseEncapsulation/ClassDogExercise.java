package exerciseEncapsulation;

public class ClassDogExercise {
    String name;
    int age;
    String gender;
    String race;
    int weight;

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 0 || age < 20) {
            this.age = age;
        } else {
            System.out.println(" Age should be > 0");
        }

    }

    public void setWeight(int weight) {
        if (weight > 0 || weight < 100) {
            this.weight = weight;
        } else {
            System.out.println(" Wrong input");
        }
    }

    public ClassDogExercise(String name, int age, String gender, String race, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }


    public ClassDogExercise(String gender, String race) {
        this("Bony", 5, gender, race, 10);
        this.gender = gender;
        this.race = race;


    }

    @Override
    public String toString() {
        return "ClassDogExercise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
