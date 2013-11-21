package is.gogg.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;


public class BoardTest {
	@Test
	public void checkConstructor() {
		Board game = new Board();
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
		    Board game = new Board();
   		   game.makeTurn('x',number[i]);
		      game.makeTurn('x',number[i+1]);
   		     game.makeTurn('x',number[i+2]);

    	   	assertTrue(game.isGameOver());
	     }
    }

    //Tests if it is Player2's turn.
    @Test
    public void checkWhosTurnTest() {
      Board game = new Board();
      game.makeTurn('X', 0);
      assertTrue(!game.playersTurn());
    }

 @test 
public void isTakenTest() {       	
       	Board game = new Board()
     	for (int i  = 0 ; i < 9 ; i++)
     	{
     		game.makeTurn('X',i);
     	}
     	for(int i = 0;  i < 9; i++)
     	{
     		assertFalse(game.isTaken(i));
     	}

     	Board board = new board();

     	for(int i = 0;  i < 9; i++)
     	{
     		assertTrue(game.isTaken(i));
     	}

     	}
	
}
