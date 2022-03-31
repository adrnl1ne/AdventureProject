package Game.NPC;

public class NPC {

  private int strength;
  private int endurance;
  private int agility;
  private int intelligence;
  private int lvl;
  private int hitPointsModifier;
  private int ac;
  private int monsterHp;

  public NPC() {
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }

  public void setHitPointsModifier(int hitPointsModifier)
  {
    this.hitPointsModifier = hitPointsModifier;
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

  public void setAc(int ac) {
    this.ac = ac;
  }

  public void setMonsterHp(int monsterHp) {
    this.monsterHp = monsterHp;
  }

  public int getMonsterHp() {
    return monsterHp;
  }

  public int getLvl() {
    return lvl;
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

  public int getHitPointsModifier()
  {
    return hitPointsModifier;
  }

  public int getAc() {
    return ac;
  }

  @Override
  public String toString() {
    return "Hit Points: " + getHitPointsModifier() +
        "\nLevel: " + getLvl() +
        "\nStrength: " + getStrength() +
        "\nEndurance: " + getEndurance() +
        "\nIntelligence: " + getIntelligence() +
        "\nAgility: " + getAgility();
  }
}
