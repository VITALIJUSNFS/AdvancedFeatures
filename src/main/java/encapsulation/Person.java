package encapsulation;

public class Person {
    private String name;
    private int personalNumber;
    private String eyeColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            this.name = name;
        } else {
            System.out.println("Name too short");
        }
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        if (personalNumber > 0) {
            this.personalNumber = personalNumber;
        } else {
            System.out.println("Wong input");
        }
    }

    public String getEyeColor() {
        return eyeColor;
    }
    //setteris istrintas
//    public void setEyeColor(String eyeColor) {
//        this.eyeColor = eyeColor;
}

