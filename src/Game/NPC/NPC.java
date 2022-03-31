package Game.NPC;

public class NPC {

  private int hp;
  private int strength;
  private int endurance;
  private int agility;
  private int intelligence;
  private int lvl;

  public NPC() {
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public void setEndurance(int endurance) {
    this.endurance = endurance;
  }

  public void setAgility(int agility) {
    this.agility = agility;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public int getLvl() {
    return lvl;
  }

  public int getHp() {
    return hp;
  }

  public int getStrength() {
    return strength;
  }

  public int getEndurance() {
    return endurance;
  }

  public int getAgility() {
    return agility;
  }

  public int getIntelligence() {
    return intelligence;
  }

  @Override
  public String toString() {
    return "Hit Points: " + getHp() +
        "\nLevel: " + getLvl() +
        "\nStrength: " + getStrength() +
        "\nEndurance: " + getEndurance() +
        "\nIntelligence: " + getIntelligence() +
        "\nAgility: " + getAgility();
  }
}
