package Game.MapStuff;

import Game.Combat;
import Game.NPC.*;
import Game.Player.PlayerInfo;
import Game.RandomGenerator;


public class Encounter {
  private Monster currentMonster = new Monster();
  RandomGenerator randomGenerator = new RandomGenerator();

  public void encounter(Combat combat, PlayerInfo playerInfo) {
    int dice = randomGenerator.hundredSideDice();
    if (dice > 60 && dice < 71) {
      System.out.println("You meet a friendly fairy, that gives you a boost of energy!");
      playerInfo.getCurrentClass().setHitPoints(+2);
    } else if (dice > 70 && dice < 81) {
      goblinEncounter(combat, playerInfo);
    } else if (dice > 80 && dice < 91) {
      orcEncounter(combat, playerInfo);
    } else if (dice > 90 && dice < 100) {
      trollEncounter(combat, playerInfo);
    } else if (dice == 100) {
      System.out.println("You meet a mighty dragon, that eats you in a single bite!");
      playerInfo.getCurrentClass().setHitPoints(0);
    } else if (dice == 5) {
      minotaurEncounter(combat, playerInfo);
    }



  }




  public void goblinEncounter(Combat combat, PlayerInfo playerInfo) {
    System.out.println("You have met a goblin!");
    setCurrentMonster(new Goblin());
    combat.combatSystem(playerInfo,this);
  }

  public void minotaurEncounter(Combat combat, PlayerInfo playerInfo) {
    System.out.println("You have met the minotaur!");
    setCurrentMonster(new Minotaur());
    combat.combatSystem(playerInfo,this);
  }

  public void orcEncounter(Combat combat, PlayerInfo playerInfo) {
    System.out.println("You have met an orc!");
    setCurrentMonster(new Orc());
    combat.combatSystem(playerInfo,this);
  }

  public void trollEncounter(Combat combat, PlayerInfo playerInfo) {
    System.out.println("You have met a troll!");
    setCurrentMonster(new Troll());
    combat.combatSystem(playerInfo,this);
  }

  public void setCurrentMonster(Monster monster) {
    this.currentMonster = monster;
  }

  public Monster getCurrentMonster() {
    return currentMonster;
  }

}
