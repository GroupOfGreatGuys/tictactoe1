package is.gogg.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;


public class TicTacToeGameTest {
    @Test
    public void checkConstructor() {
         TicTacToeGame game = new TicTacToeGame();
        assertFalse(game.isGameOver());
    }

}
