package sports;

import sports.basketball.BasketballStats;

public interface IPlayer <T> {
  
  String getName();
  
  int getAge();
  
  double getHeight();
  
  <T> BasketballStats getStats(); // generic method returns status type T
  
}