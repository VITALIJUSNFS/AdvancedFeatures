package enumas.exampleGame;

public class GameMain {

    public static void main(String[] args) {
        Game game = new Game();
        game.setName("Duke 3");
        game.setGameLevel(GameLevel.HARD);

        System.out.println("Game name" + game.getName());
        final GameLevel gameLevel = game.getGameLevel();
        System.out.println("Game level" + gameLevel.levelName);
        System.out.println("Ypu have "+ gameLevel.healthPoints+" health points");
        System.out.println("Sarvai " + gameLevel.armorType);

        System.out.println();

        System.out.println(gameLevel);
    }
}
