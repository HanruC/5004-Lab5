package sports.basketball;

import java.util.Comparator;

public class BasketballPlayerComparator implements Comparator<BasketballPlayer> {
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
