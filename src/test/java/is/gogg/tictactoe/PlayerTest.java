package is.gogg.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;


public class PlayerTest {
	@Test
	public void testBoolConstructor() {
		Player p1 = new Player(true);
		assertEquals('X', p1.getMarker());
		
		Player p2 = new Player(false);
		assertEquals('O', p2.getMarker());
   	 }
	 
	 @Test
	 public void testPlayerMove()
	 {
		Player p = new Player();
		assertEquals(65, p.getPlayerMove("A1"));
	 }
}