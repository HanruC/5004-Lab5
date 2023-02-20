package sports;

import sports.basketball.BasketballStats;

/**
 * An interface that defines methods of a player in a sports game.
 * @param <T> any type.
 */
public interface IPlayer<T> {
  
  /**
   * Gets the name of the player.
   *
   * @return The name of the player.
   */
  String getName();
  
  /**
   * Gets the age of the player.
   *
   * @return The age of the player.
   */
  int getAge();
  
  /**
   * Gets the height of the player.
   *
   * @return The height of the player.
   */
  double getHeight();
  
  /**
   * Gets the statistics of the player.
   *
   * @return The statistics of the player.
   */
  <T> BasketballStats getStats(); // generic method returns status type T
  
}