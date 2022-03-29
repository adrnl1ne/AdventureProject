package Game;

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
  private int hitPointsModifier;

  //constructor
  public Player() {
  }

  public void levelPlayer(Player currentClass) {
    if (currentClass.getExp() == 240) {
      currentClass.lvl = currentClass.lvl + 1;
      currentClass.exp = 0;
      currentClass.hitPointsModifier = currentClass.hitPointsModifier + 9;
    }
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

  public void setHitPointsModifier(int hitPointsModifier) {
    this.hitPointsModifier = hitPointsModifier;
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


  public int getHitPointsModifier() {
    return hitPointsModifier;
  }


  @Override
  public String toString() {
    return
        "Hit Points: " + getHitPointsModifier() +
            "\nLevel: " + getLvl() +
            "\nExperience: " + getExp() +
            "\nStrength: " + getStrength() +
            "\nPerception: " + getPerception() +
            "\nEndurance: " + getEndurance() +
            "\nCharisma: " + getCharisma() +
            "\nIntelligence: " + getIntelligence() +
            "\nAgility: " + getAgility() +
            "\nLuck: " + getLuck();
  }

}
