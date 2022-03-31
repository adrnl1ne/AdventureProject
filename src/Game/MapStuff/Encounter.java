package Game.MapStuff;

import Game.Combat;
import Game.NPC.*;
import Game.Player.PlayerInfo;
import Game.RandomGenerator;


public class Encounter {
  private Monster currentMonster;
  Combat combat;
  RandomGenerator randomGenerator;
  PlayerInfo playerInfo;

  public void encounter() {
    int dice = randomGenerator.hundredSideDice();
    if (dice > 61 && dice < 70) {
      System.out.println("You meet a friendly fairy, that gives you a boost of energy!");
      playerInfo.getCurrentClass().setHitPointsModifier(+2);
    } else if (dice > 71 && dice < 80) {
      goblinEncounter();
    } else if (dice > 81 && dice < 90) {
      orcEncounter();
    } else if (dice > 91 && dice < 99) {
      trollEncounter();
    } else if (dice == 100) {
      System.out.println("You meet a mighty dragon, that eats you in a single bite!");
      playerInfo.getCurrentClass().setHitPointsModifier(0);
    } else if (dice == 5) {
      minotaurEncounter();
    }
  }


  public void minotaurEncounter() {
    System.out.println("You have met the minotaur!");
    setCurrentMonster(new Minotaur());
    combat.combatSystem();
  }

  public void goblinEncounter() {
    System.out.println("You have met a goblin!");
    setCurrentMonster(new Goblin());
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

  public void setCurrentMonster(Monster monster) {
    this.currentMonster = monster;
  }

  public Monster getCurrentMonster() {
    return currentMonster;
  }
}
