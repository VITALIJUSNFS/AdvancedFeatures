package enumas.exampleGame;

public enum GameLevel {
    EASY(300, "Golden", "Easy"),
    MEDIUM(200, "Iron", "Medium"),
    HARD(100, "Wooden", "Hard"),
    EXTREME(50, "Cloth", "Extreme");

    final int healthPoints;
    final String armorType;
    final String levelName;

    GameLevel(int healthPoints, String armorType, String levelName) {
        this.healthPoints = healthPoints;
        this.armorType = armorType;
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "GameLevel{" +
                "healthPoints=" + healthPoints +
                ", armorType='" + armorType + '\'' +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}
