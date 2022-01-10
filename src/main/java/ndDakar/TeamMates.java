package ndDakar;

public class TeamMates {

    private String firstName;
    private String secondName;
    private String country;
    private String experience;
    private int salary;

    public TeamMates(String firstName, String secondName, String country, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
        this.salary = salary;
    }

    public TeamMates(String firstName, String secondName, String country, String experience, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.country = country;
        this.experience = experience;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TeamMates{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", country='" + country + '\'' +
                ", experience='" + experience + '\'' +
                ", salary=" + salary +
                '}';



    }
}
