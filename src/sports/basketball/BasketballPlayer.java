package sports.basketball;

import sports.IPlayer;
import java.util.Objects;

/**
 * A class that represents a basketball player.
 */
public class BasketballPlayer implements IPlayer<BasketballStats> {
  private String playerName;
  private int playerAge;
  private double playerHeight;
  private BasketballStats playerStats;
  
  /**
   * Constructor for a BasketballPlayer object.
   *
   * @param playerName The name of the player.
   * @param playerAge The age of the player.
   * @param playerHeight The height of the player.
   * @param playerStats The stats of the player.
   */
  public BasketballPlayer(String playerName, int playerAge, double playerHeight,
                          BasketballStats playerStats) {
    this.playerName = playerName;
    this.playerAge = playerAge;
    this.playerHeight = playerHeight;
    this.playerStats = playerStats;
  }
  
  /**
   * Copy constructor for a BasketballPlayer object.
   *
   * @param other The BasketballPlayer to copy.
   */
  //Copy constructor. MAKE SURE WE DO NOT share the stats between copies of player.
  public BasketballPlayer(BasketballPlayer other) {
    this.playerName = other.playerName;
    this.playerAge = other.playerAge;
    this.playerHeight = other.playerHeight;
    this.playerStats = new BasketballStats(other.playerStats.getPointsPerGame(),
            other.playerStats.getReboundsPerGame(), other.playerStats.getAssistsPerGame());
  }
  
  /**
   * Get name of player.
   * @return name
   */
  @Override
  public String getName() {
    return this.playerName;
  }
  
  /**
   * Get age of player.
   * @return age
   */
  @Override
  public int getAge() {
    return this.playerAge;
  }
  
  /**
   * Get height of player.
   * @return height
   */
  @Override
  public double getHeight() {
    return this.playerHeight;
  }
  
  /**
   * Get stats of player.
   * @return stats.
   */
  @Override
  public BasketballStats getStats() {
    return this.playerStats;
  }
  
  /**
   * Override toSting method.
   * @return string
   */
  @Override
  public String toString() {
    return this.playerName + ": (pts " + this.getStats().getPointsPerGame() + ", rebounds "
            + this.getStats().getReboundsPerGame()
            + ", assists " + this.getStats().getAssistsPerGame() + ")";
  }
  
  /**
   * Override equals method.
   * @param other other object
   * @return true or false
   */
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (this.getClass() != other.getClass()) return false;
    BasketballPlayer o = (BasketballPlayer) other;
    return Double.compare(o.playerHeight, playerHeight) == 0 && this.playerAge == o.playerAge
            && this.playerName.equals(o.playerName); // never use == for floating point
  }
  
  /**
   * Hashcode override.
   * @return hashcode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.playerName, this.playerAge, this.playerHeight);
  }
}
