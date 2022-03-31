package Game.Player;


import Game.Controller;
import Game.MapStuff.Encounter;
import Game.RandomGenerator;

public class PlayerInfo {
  //s,p,e,c,i,a,l
  RandomGenerator randomGenerator = new RandomGenerator();

  private Player currentClass;


  public void checkStats() {
    System.out.println(currentClass);
  }


  public Player getCurrentClass() {
    return currentClass;
  }

  public void setChosenClass(Player currentClass) {
    this.currentClass = currentClass;
    //todo decide where to calculate hit points - rename method
  }





}
