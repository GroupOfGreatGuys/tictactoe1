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
/*
    @Test
    public void checkForWinTest()
    {
    
    	TicTacToeGame game = new TicTacToeGame();
   		
   		game.makeTurn('x',0);
		game.makeTurn('x',1);
   		game.makeTurn('x',2);

    	assertTrue(game.isGameOver());

    }
*/
 @Test
    public void checkForWinTest()
    {

	// all possible winning combinationi
	int[] number = new int[] {0,1,2,3,4,5,6,7,8,0,3,6,1,4,7,2,5,8,0,4,8,2,4,6};
   	for(int i = 0; i < 24; i = i + 3)
	{
		TicTacToeGame game = new TicTacToeGame();
   		game.makeTurn('x',number[i]);
		game.makeTurn('x',number[i+1]);
   		game.makeTurn('x',number[i+2]);

    		assertTrue(game.isGameOver());
	}
    }
}
