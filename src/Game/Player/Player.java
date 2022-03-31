package Game.Player;

import Game.Items.Item;
import Game.MapStuff.Encounter;
import Game.RandomGenerator;

public abstract class Player {

  private int exp;
  private int strength;
  private int perception;
  private int endurance;
  private int charisma;
  private int agility;
  private int intelligence;
  private int luck;
  private int lvl;
  private int hitPoints;
  private int ac;
  private int acCombat;

  //constructor
  public Player() {
  }


  public void levelPlayer(Player currentClass) {
    if (currentClass.getExp() == 240) {
      currentClass.lvl = currentClass.lvl + 1;
      currentClass.exp = 0;
      currentClass.hitPoints = currentClass.hitPoints + 9;
    }
  }

  public void setAcCombat(int acCombat) {
    this.acCombat = acCombat;
  }

  public int getAcCombat() {
    return acCombat;
  }

  public void setAc(int ac) {
    this.ac = ac;
  }

  public int getAc() {
    return ac;
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }

  public void setExp(int exp) {
    this.exp = exp;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setPerception(int perception) {
    this.perception = perception;
  }

  public void setEndurance(int endurance) {
    this.endurance = endurance;
  }

  public void setCharisma(int charisma) {
    this.charisma = charisma;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  public void setLuck(int luck) {
    this.luck = luck;
  }

  public int getLvl() {
    return lvl;
  }

  public int getExp() {
    return exp;
  }

  public int getAgility() {
    return agility;
  }

  public int getEndurance() {
    return endurance;
  }

  public int getCharisma() {
    return charisma;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public int getStrength() {
    return strength;
  }

  public int getPerception() {
    return perception;
  }

  public int getLuck() {
    return luck;
  }


  public int getHitPoints() {
    return hitPoints;
  }


  @Override
  public String toString() {
    return
        "Hit Points: " + getHitPoints() +
            "\nLevel: " + getLvl() +
            "\nExperience: " + getExp() +
            "\nStrength: " + getStrength() +
            "\nPerception: " + getPerception() +
            "\nEndurance: " + getEndurance() +
            "\nCharisma: " + getCharisma() +
            "\nIntelligence: " + getIntelligence() +
            "\nAgility: " + getAgility() +
            "\nLuck: " + getLuck() +
            "\nAC: " + getAc();
  }

}
