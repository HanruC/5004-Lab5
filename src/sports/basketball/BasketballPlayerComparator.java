package sports.basketball;

import java.util.Comparator;

/**
 * A comparator class that compares two basketball players based on their points per game.
 */
public class BasketballPlayerComparator implements Comparator<BasketballPlayer> {
  
  /**
   * Compares two basketball players based on their points per game.
   *
   * @param o1 The first basketball player to compare.
   * @param o2 The second basketball player to compare.
   * @return -1 if the first player has fewer points per game, 0 if they have the same points per game, and 1 if they have more points per game.
   */
  public int compare(BasketballPlayer o1, BasketballPlayer o2) {
    BasketballStats stats1;
    BasketballStats stats2;
    stats1 = o1.getStats();
    stats2 = o2.getStats();
    if (Double.compare(stats1.getPointsPerGame(), stats2.getPointsPerGame()) == 0)
      return 0;
    else if (stats1.getPointsPerGame() > stats2.getPointsPerGame())
      return 1;
    else
      return -1;
  }
}
