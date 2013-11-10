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
	public void draw()
	{
		// This function draws up the board
	}
	
	public boolean isGameOver()
	{
		return gameOver;
	}
}
