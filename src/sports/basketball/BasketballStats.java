package sports.basketball;

import java.util.Objects;

/**
 * A class that represents the statistics of a basketball player.
 */
public class BasketballStats {
  private double pointsPerGame;
  private double reboundsPerGame;
  private double assistsPerGame;
  
  /**
   * Constructor for a BasketballStats object.
   *
   * @param pointsPerGame The points per game of the player.
   * @param reboundsPerGame The rebounds per game of the player.
   * @param assistsPerGame The assists per game of the player.
   */
  public BasketballStats(double pointsPerGame, double reboundsPerGame,
                         double assistsPerGame) {
    this.pointsPerGame = pointsPerGame;
    this.reboundsPerGame = reboundsPerGame;
    this.assistsPerGame = assistsPerGame;
  }
  
  /**
   * Gets the points per game of the player.
   *
   * @return The points per game of the player.
   */
  public double getPointsPerGame() {
    return this.pointsPerGame;
  }
  
  /**
   * Gets the rebounds per game of the player.
   *
   * @return The rebounds per game of the player.
   */
  public double getReboundsPerGame() {
    return this.reboundsPerGame;
  }
  
  /**
   * Gets the assists per game of the player.
   *
   * @return The assists per game of the player.
   */
  public double getAssistsPerGame() {
    return this.assistsPerGame;
  }
  
  /**
   * Override toString method.
   * @return string.
   */
  @Override
  public String toString() {
    return String.format("Points: %.2f. Rebounds: %.2f. Assists: %.2f", this.pointsPerGame,
            this.reboundsPerGame, this.assistsPerGame);
  }
  
  /**
   * Override equals method.
   * @param other other object
   * @return true or false
   */
  public boolean equals(Object other) {
    if (this == other) return true;
    if (this.getClass() != other.getClass()) return false;
    BasketballStats o = (BasketballStats) other;
    if (this.assistsPerGame == o.assistsPerGame
            && this.reboundsPerGame == o.reboundsPerGame
            && this.pointsPerGame == o.pointsPerGame) {
      return true;
    }
    return false;
  }
  
  /**
   * Override hashcode method.
   * @return hashcode.
   */
  public int hashCode() {
    return Objects.hash(this.assistsPerGame, this.reboundsPerGame, this.pointsPerGame);
  }
  
}