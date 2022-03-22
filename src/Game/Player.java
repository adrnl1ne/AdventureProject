package Game;

public class Player {

  private int hp;
  private int exp;
  private int strength;
  private int perception;
  private int endurance;
  private int charisma;
  private int agility;
  private int intelligence;
  private int luck;
  private int lvl;
  private String playerClass;

  //constructor
  public Player(String playerClass, int lvl, int exp, int hp, int strength, int perception, int endurance, int charisma,
                int intelligence, int agility, int luck) {
    this.playerClass = playerClass;
    this.lvl = lvl;
    this.exp = exp;
    this.hp = hp;
    this.strength = strength;
    this.perception = perception;
    this.endurance = endurance;
    this.charisma = charisma;
    this.intelligence = intelligence;
    this.agility = agility;
    this.luck = luck;
  }

  public void levelPlayer(Player currentClass) {
    if (currentClass.getExp() == 240) {
      currentClass.lvl = currentClass.lvl + 1;
      currentClass.exp = 0;
      currentClass.hp = currentClass.hp + 9;
    }
  }

  public int getLvl() {
    return lvl;
  }

  public int getExp() {
    return exp;
  }

  public int getHp() {
    return hp;
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

  public String getPlayerClass() {
    return playerClass;
  }


  @Override
  public String toString() {
    return "Class: " + playerClass +
        "\nHit Points: " + hp +
        "\nLevel: " + lvl +
        "\nExperience: " + exp +
        "\nStrength: " + strength +
        "\nPerception: " + perception +
        "\nEndurance: " + endurance +
        "\nCharisma: " + charisma +
        "\nIntelligence: " + intelligence +
        "\nAgility: " + agility +
        "\nLuck: " + luck;
  }

}
