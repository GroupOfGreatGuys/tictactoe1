package is.gogg.tictactoe;

public class Player
{
	private char marker;
	private boolean isHuman;
	
	Player()
	{
		marker = 'X';
		isHuman = true;
	}
	
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
	
	public Player(boolean species, char sign)
	{
		marker = sign;
		isHuman = species;
	}
	
	public char getMarker()
	{
		return marker;
	}
	
	public boolean isHuman()
	{
		return isHuman;
	}
	
	public int getPlayerMove(String coord)
	{
		char letter = Character.toUpperCase(coord.charAt(0));
		return (int) letter;
	}
}