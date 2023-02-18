package sports.basketball;

import sports.IPlayer;

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
    this.playerStats = new BasketballStats(playerStats.getPointsPerGame(),
            playerStats.getReboundsPerGame(), playerStats.getAssistsPerGame());
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
    return String.format("Name: %s. Age: %d. Height: %.2f. Stats: %s", this.playerName,
            this.playerAge,
            this.playerHeight, this.playerStats.toString());
  }
  
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (this.getClass() != other.getClass()) return false;
    BasketballPlayer o = (BasketballPlayer) other;
    if (this.playerAge == o.playerAge && this.playerHeight == o.playerHeight
            && this.playerName == o.playerName && this.playerStats == o.playerStats) {
      return true;
    }
    return false;
  }
}
