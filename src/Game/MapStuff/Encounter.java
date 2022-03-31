package Game.MapStuff;

import Game.Combat;
import Game.NPC.*;
import Game.Player.PlayerInfo;
import Game.RandomGenerator;


public class Encounter {
  private Monster currentMonster;
  RandomGenerator randomGenerator = new RandomGenerator();
  PlayerInfo playerInfo = new PlayerInfo();

  public void encounter(Combat combat) {
    /*int dice = randomGenerator.hundredSideDice();
    if (dice > 60 && dice < 71) {
      System.out.println("You meet a friendly fairy, that gives you a boost of energy!");
      playerInfo.getCurrentClass().setHitPoints(+2);
    } else if (dice > 70 && dice < 81) {
      goblinEncounter();
    } else if (dice > 80 && dice < 91) {
      orcEncounter();
    } else if (dice > 90 && dice < 100) {
      trollEncounter();
    } else if (dice == 100) {
      System.out.println("You meet a mighty dragon, that eats you in a single bite!");
      playerInfo.getCurrentClass().setHitPoints(0);
    } else if (dice == 5) {
      minotaurEncounter();
    }

     */
    goblinEncounter(combat);
  }




  public void goblinEncounter(Combat combat) {
    System.out.println("You have met a goblin!");
    setCurrentMonster(new Goblin());
    combat.combatSystem();
  }
/*
  public void minotaurEncounter() {
    System.out.println("You have met the minotaur!");
    setCurrentMonster(new Minotaur());
    combat.combatSystem();
  }

  public void orcEncounter() {
    System.out.println("You have met an orc!");
    setCurrentMonster(new Orc());
    combat.combatSystem();
  }

  public void trollEncounter() {
    System.out.println("You have met a troll!");
    setCurrentMonster(new Troll());
    combat.combatSystem();
  }
*/
  public void setCurrentMonster(Monster monster) {
    this.currentMonster = monster;
  }

  public Monster getCurrentMonster() {
    return currentMonster;
  }

}
