import java.util.*;

public class snakeAndLadderGame {
    public static void main(String[] args)
    {
        System.out.println("The Main Game is begin here");
        List<Snake> snakes = Arrays.asList(new Snake(14, 7),new Snake(31, 26),new Snake(98, 78));


        List<Ladder> ladders =Arrays.asList(new Ladder(3, 38), new Ladder(24, 33),new Ladder(42, 93), new Ladder(72, 84));

        Board board = new Board(100, snakes, ladders);

        List<String> players = Arrays.asList("Player 1", "Player 2", "Player 3");
        Game game = new Game.Builder()
                .setBoard(board)
                .setPlayers(players)
                .setDice(new Dice(1, 6))
                .build();

        game.play();
    }

}
