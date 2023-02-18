package sports.basketball;

import java.util.Comparator;

public class BasketballPlayerComparator implements Comparator<BasketballPlayer> {
  
  @Override
  public int compare(BasketballPlayer o1, BasketballPlayer o2) {
    if (o1.getStats().getPointsPerGame() < o2.getStats().getPointsPerGame()) {
      return -1;
    } else if (o1.getStats().getPointsPerGame() > o2.getStats().getPointsPerGame()) {
      return 1;
    } else {
      return 0;
    }
  }
}
