import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;

public class BoardTest {
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
	public void testMakeTurnWithInvalidIndex()
	{
		Board b = new Board();
		for(int i = 9; i < 2500; i = i * 2)
		assertFalse(b.makeTurn('X', i));
		assertFalse(b.makeTurn('X', 9));
	}
	
 @Test
    public void checkForWinTest()
    {

	    // all possible winning combinationi
	    int[] number = new int[] {0,1,2,3,4,5,6,7,8,0,3,6,1,4,7,2,5,8,0,4,8,2,4,6};
		boolean temp;
   	    for(int i = 0; i < 24; i = i + 3)
	     {
		    Board game = new Board();
			temp = game.makeTurn('X',number[i]);
		    temp = game.makeTurn('X',number[i+1]);
   		    temp = game.makeTurn('X',number[i+2]);

    	   	assertTrue(game.checkForWin('X'));
	     }
    }
<<<<<<< HEAD
=======

    //Tests if it is Player2's turn.
    @Test
    public void checkWhosTurnTest() {
      Board game = new Board();
      game.makeTurn('X', 0);
      assertTrue(!game.playersTurn());
    }

	@Test
        public void isTakenTest(){
       	
       	Board game = new Board();
     
     	for (int i  = 0 ; i < 9 ; i++)
     	{
     		game.makeTurn('X',i);
     	}
     	for(int i = 0;  i < 9; i++)
     	{
     		assertTrue(game.isTaken(i));
     	}

     	Board board = new Board();

     	for(int i = 0;  i < 9; i++)
     	{
     		assertFalse(board.isTaken(i));
     	}

     }
>>>>>>> f5ce75c90b36f004b99de54232d9a27a4c00c124
}
