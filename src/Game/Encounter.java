package Game;

import Game.MapStuff.Map;

public class Encounter {

  public void encounter(Map map){
    System.out.println(map.getCurrentExplore().getDescription());
  }

}
