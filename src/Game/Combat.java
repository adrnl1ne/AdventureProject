package Game;

import Game.MapStuff.Encounter;
import Game.Player.PlayerInfo;


public class Combat {
  RandomGenerator randomGenerator = new RandomGenerator();
  PlayerInfo playerInfo;
  private int attackRoll;
  private int damage;
  private int attack;
  Encounter encounter;


  public void playerAttack() {
    attackRoll = randomGenerator.twentySideDice();
    if (attackRoll > encounter.getCurrentMonster().getAc())
    {
      damage = randomGenerator.twentySideDice() + (playerInfo.getCurrentClass().getStrength() - 10) / 2;
      System.out.println(damage);
    }
    else {
      System.out.println("your attack missed the monster this time");
    }
  }

  public void monsterAttack() {
    attack = randomGenerator.twentySideDice();
    if (playerInfo.getCurrentClass().getAc() < attack )
    {
      int monsterDamage = randomGenerator.eightSideDice() + (encounter.getCurrentMonster().getStrength() - 10) / 2;
      System.out.println(monsterDamage);
    }
    else
    {
      System.out.println("the monsters attack missed you this time");
    }
  }

  public void combatSystem() {
    while (playerInfo.getCurrentClass().getHitPointsModifier() > 0 &&
        encounter.getCurrentMonster().getMonsterHp() > 0) {
      playerAttack();
      monsterAttack();
    }
  }

}
