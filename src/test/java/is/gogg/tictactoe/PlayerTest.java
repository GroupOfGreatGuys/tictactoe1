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
	 
	 /*@Test
	 public void testPlayerMove()
	 {
		// Need to fix this since this function is now private
		Player p = new Player();
		assertEquals(0, p.getPlayerMove("A1"));
		assertEquals(0, p.getPlayerMove("a1"));
		assertEquals(1, p.getPlayerMove("a2"));
		assertEquals(2, p.getPlayerMove("a3"));
		assertEquals(3, p.getPlayerMove("b1"));
		assertEquals(4, p.getPlayerMove("b2"));
		assertEquals(5, p.getPlayerMove("b3"));
		assertEquals(6, p.getPlayerMove("c1"));
		assertEquals(7, p.getPlayerMove("c2"));
		assertEquals(8, p.getPlayerMove("c3"));
	 }*/
	 
	 @Test
	 public void testComputerMove()
	 {
		// Function returns a random number in the range 0-8
		Player p = new Player();
		for(int i = 0; i < 20; i++)
		{
			assertTrue(p.getComputerMove() >= 0 && p.getComputerMove() <= 8);
		}
	 }
}