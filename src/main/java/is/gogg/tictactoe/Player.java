package is.gogg.tictactoe;

public class Player
{
	private char marker;
	private boolean isHuman;
	
	// Initializes mark to 'X' if isHuman is true, 'O' otherwise
	public Player(boolean isHuman)
	{
		if(isHuman)
		{
			marker = 'X';
		}
		else
		{
			marker = 'O';
		}
	}
	
	public char getMarker()
	{
		return marker;
	}
	
	public boolean isHuman()
	{
		return isHuman;
	}
}