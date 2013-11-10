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

    @Test
    public void checkForWinTest()
    {
    
    	TicTacToeGame game = new TicTacToeGame();
   		
   		game.makeTurn('x',0);
		game.makeTurn('x',1);
   		game.makeTurn('x',2);

    	assertTrue(game.isGameOver());

    }

}
