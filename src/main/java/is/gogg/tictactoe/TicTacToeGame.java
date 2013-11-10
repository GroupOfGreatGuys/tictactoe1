package is.gogg.tictactoe;

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
		gameOver = checkForWin(sign);
	}
	
	public boolean checkForWin(char sign)
	{
		if (squares[0] == sign &&
               	squares[1] == sign &&
               	squares[2] == sign) {
                    return true;
                }

                if (squares[3] == sign &&
                   squares[4] == sign &&
                   squares[5] == sign) {
                    return true;
                }

                if (squares[6] == sign &&
                   squares[7] == sign &&
                   squares[8] == sign) {
                    return true;
                }

                if (squares[0] == sign &&
                   squares[3] == sign &&
                   squares[6] == sign) {
                    return true;
                }

                if (squares[1] == sign &&
                   squares[4] == sign &&
                   squares[7] == sign) {
                    return true;
                }

                if (squares[2] == sign &&
                   squares[5] == sign &&
                   squares[8] == sign) {
                    return true;
                }

                if (squares[0] == sign &&
                   squares[4] == sign &&
                   squares[8] == sign) {
                    return true;
                }

                if (squares[2] == sign &&
                   squares[4] == sign &&
                   squares[6] == sign) {
                    return true;
                }
		return false;
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
