package Game.MapStuff;

import java.io.IOException;

public class Encounter {

Map map = new Map();

  public Encounter() throws IOException {
  }

  public void encounter(){
    switch (map.getCurrentRoom().getNumber()) {
      case 4 -> orcEncounter();

    }
  }

  public void orcEncounter() {
    System.out.println("You have met an orc!");
  }


}
