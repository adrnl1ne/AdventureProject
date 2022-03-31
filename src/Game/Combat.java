package Game;


import Game.MapStuff.Encounter;
import Game.Player.PlayerInfo;

public class Combat {
  RandomGenerator randomGenerator = new RandomGenerator();
  Encounter encounter = new Encounter();
  PlayerInfo playerInfo = new PlayerInfo();
  boolean combatInProgress = true;


  public void monsterAttack() {
    int attackRoll = randomGenerator.twentySideDice();
    System.out.println("player AC " + playerInfo.getCurrentClass().getAc());
    if (attackRoll > playerInfo.getCurrentClass().getAc()) {
      int damage = randomGenerator.callRoomDice() + (encounter.getCurrentMonster().getStrength() - 10);
      playerInfo.getCurrentClass().setHitPoints(playerInfo.getCurrentClass().getHitPoints() - damage);
    } else {
      System.out.println("Monsters attack missed you this time!");
    }

  }

  public void playerAttack() {
    int attackRoll = randomGenerator.twentySideDice() + 11;
    System.out.println("Your attack was: " + attackRoll);
    if (attackRoll > encounter.getCurrentMonster().getAc()) {
      int damage = randomGenerator.eightSideDice() + playerInfo.getCurrentClass().getStrength();
      encounter.getCurrentMonster().setMonsterHp(encounter.getCurrentMonster().getMonsterHp() - damage);
      System.out.println("You did " + damage + " damage to the monster");
    } else {
      System.out.println("your attack missed the monster this time");
    }
  }

  public void combatSystem() {
    System.out.println("you've encountered a monster!!! get ready for battle!");
    Interface userInterface = new Interface();

    while (combatInProgress) {
      System.out.println("""
          what would you like to do?
          1) eat food/drink potion to regain hp
          2) attack the monster
          """);
      switch (userInterface.getIntInput()) {
        case 1 -> System.out.println("eating");
        case 2 -> playerAttack();
      }
      if (encounter.getCurrentMonster().getMonsterHp() <= 0) {
        System.out.println("monster is dead");
        combatInProgress = false;
      } else if (playerInfo.getCurrentClass().getHitPoints() <= 0) {
        System.out.println("you have died!");
        combatInProgress = false;
      } else {
        monsterAttack();
      }

    }
  }




}
