package Game;

public class NPC {

  private int hp;
  private int strength;
  private int endurance;
  private int agility;
  private int intelligence;
  private int lvl;
  private String npcClass;

  public NPC(String npcClass, int lvl, int hp, int strength, int endurance, int agility, int intelligence) {
    this.npcClass = npcClass;
    this.lvl = lvl;
    this.hp = hp;
    this.strength = strength;
    this.endurance = endurance;
    this.agility = agility;
    this.intelligence = intelligence;
  }

  @Override
  public String toString() {
    return "Class: " + npcClass +
        "\nHit Points: " + hp +
        "\nLevel: " + lvl +
        "\nStrength: " + strength +
        "\nEndurance: " + endurance +
        "\nIntelligence: " + intelligence +
        "\nAgility: " + agility;
  }
}
