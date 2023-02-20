package sports.basketball;

import sports.IPlayer;

import java.util.Objects;

public class BasketballPlayer implements IPlayer<BasketballStats> {
  private String playerName;
  private int playerAge;
  private double playerHeight;
  private BasketballStats playerStats;
  
  public BasketballPlayer(String playerName, int playerAge, double playerHeight,
                          BasketballStats playerStats) {
    this.playerName = playerName;
    this.playerAge = playerAge;
    this.playerHeight = playerHeight;
    this.playerStats = playerStats;
  }
  
  //Copy constructor. mAKE SURE WE DO NOT share the stats between copies of player.
  public BasketballPlayer(BasketballPlayer other) {
    this.playerName = other.playerName;
    this.playerAge = other.playerAge;
    this.playerHeight = other.playerHeight;
    this.playerStats = new BasketballStats(other.playerStats.getPointsPerGame(),
            other.playerStats.getReboundsPerGame(), other.playerStats.getAssistsPerGame());
  }
  
  @Override
  public String getName() {
    return this.playerName;
  }
  
  @Override
  public int getAge() {
    return this.playerAge;
  }
  
  @Override
  public double getHeight() {
    return this.playerHeight;
  }
  
  @Override
  public BasketballStats getStats() {
    return this.playerStats;
  }
  
  @Override
  public String toString() {
    return this.playerName + ": (pts " + this.getStats().getPointsPerGame() + ", rebounds "
            + this.getStats().getReboundsPerGame()
            + ", assists " + this.getStats().getAssistsPerGame() + ")";
  }
  
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (this.getClass() != other.getClass()) return false;
    BasketballPlayer o = (BasketballPlayer) other;
    return Double.compare(o.playerHeight, playerHeight) == 0 && this.playerAge == o.playerAge &&
            this.playerName.equals(o.playerName); // never use == for floating point
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(this.playerName, this.playerAge, this.playerHeight);
  }
}
