package ndDakar;

public enum ExperienceLevel {
    BEGINNER("Less than 3 years", "Less than 20 years"),
    ADVANCED("Between 3-10 years", "Between 20 years to 30 years"),
    GURU("More than 10", "Older than 30");

    final String ageOfExperience;
    final String rangOfAgeDriver;

    ExperienceLevel(String ageOfExperience, String rangOfAgeDriver) {
        this.ageOfExperience = ageOfExperience;
        this.rangOfAgeDriver = rangOfAgeDriver;


    }
}
