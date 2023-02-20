import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import sports.basketball.BasketballPlayer;
import sports.basketball.BasketballStats;




/**
 * JUnit test class for the BasketballPlayer and BasketballStats classes.
 */
public class BasketballPlayerTest {
  
  /**
   * Test get name.
   */
  @Test
  public void testGetName() {
    BasketballPlayer player = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 3.0));
    assertEquals("Luke", player.getName());
  }
  
  /**
   * Test get age.
   */
  @Test
  public void testGetAge() {
    BasketballPlayer player = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 3.0));
    assertEquals(25, player.getAge());
  }
  
  /**
   * Test get height.
   */
  @Test
  public void testGetHeight() {
    BasketballPlayer player = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 3.0));
    assertEquals(5.8, player.getHeight(), 0.01);
  }
  
  /**
   * Test get stats.
   */
  @Test
  public void testGetStats() {
    BasketballPlayer player = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 2.0));
    BasketballStats stats = player.getStats();
    assertNotNull(stats);
    assertEquals(50.0, stats.getPointsPerGame(), 0.01);
    assertEquals(5.0, stats.getReboundsPerGame(), 0.01);
    assertEquals(2.0, stats.getAssistsPerGame(), 0.01);
  }
  
  /**
   * Test copied constructor.
   */
  @Test
  public void testCopyConstructor() {
    BasketballPlayer player1 = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 2.0));
    BasketballPlayer player2 = new BasketballPlayer(player1);
    assertNotSame(player1, player2); // test copied constructor.
    assertEquals(player1.getName(), player2.getName());
    assertEquals(player1.getAge(), player2.getAge());
    assertEquals(player1.getHeight(), player2.getHeight(), 0.01);
    assertEquals(player1.getStats().getPointsPerGame(),
            player2.getStats().getPointsPerGame(), 0.01);
    assertEquals(player1.getStats().getReboundsPerGame(),
            player2.getStats().getReboundsPerGame(), 0.01);
    assertEquals(player1.getStats().getAssistsPerGame(),
            player2.getStats().getAssistsPerGame(), 0.01);
  }
  
  /**
   * Test equals method.
   */
  @Test
  public void testEquals() {
    BasketballPlayer player1 = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 2.0));
    BasketballPlayer player2 = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 2.0));
    BasketballPlayer player3 = new BasketballPlayer("Chen", 25, 6.0,
            new BasketballStats(40.0, 4.0, 2.0));
    assertTrue(player1.equals(player2));
    assertFalse(player1.equals(player3));
  }
  
  /**
   * Test hashcode method.
   */
  @Test
  public void testHashCode() {
    BasketballPlayer player1 = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 2.0));
    BasketballPlayer player2 = new BasketballPlayer("Luke", 25, 5.8,
            new BasketballStats(50.0, 5.0, 2.0));
    BasketballPlayer player3 = new BasketballPlayer("Chen", 25, 6.0,
            new BasketballStats(80, 4.0, 2.0));
    assertEquals(player1.hashCode(), player2.hashCode());
    assertNotEquals(player1.hashCode(), player3.hashCode());
  }
}