package tictactoe;

public class TicTacToeGame
{
	private char[] squares;
	boolean gameOver;

	public TicTacToeGame()
	{
		gameOver = false;
		squares = new char[9];
	}
	
	public void makeTurn(char sign, int index)
	{
		// Makes a player turn, puts the player's sign in the correct index
		squares[index] = sign;
		checkForWin();
	}
	
	public void checkForWin()
	{
		// Checks if the game is over
	}

	public void draw()
	{
		// This function draws up the board
	}
	
	public boolean isGameOver()
	{
		return gameOver;
	}
}
