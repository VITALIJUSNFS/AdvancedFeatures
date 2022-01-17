package Streams.example1;

import java.util.List;

public class Human {

    private String name;
    private int age;
    private String gender;
    private List<Human> siblings;

    public Human(String name, int age, String gender, List<Human> siblings) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.siblings = siblings;
    }

    // sibling - broliai, seseris

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Human> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Human> siblings) {
        this.siblings = siblings;
    }
}
