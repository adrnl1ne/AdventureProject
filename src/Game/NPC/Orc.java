package Game.NPC;

public class Orc extends Monster {

  public Orc() {
    super();
    setStrength(12);
    setEndurance(10);
    setIntelligence(randomGenerator.stat());
    setAgility(randomGenerator.stat());
    setHitPointsModifier(10);
    setMonsterHp(getHitPointsModifier());
    setAc(10 + getEndurance());
  }
}
