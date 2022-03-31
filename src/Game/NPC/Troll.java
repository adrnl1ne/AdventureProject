package Game.NPC;

public class Troll extends Monster{

  public Troll() {
    super();
    setStrength(14);
    setEndurance(14);
    setIntelligence(randomGenerator.stat());
    setAgility(randomGenerator.stat());
    setHitPointsModifier(14 + ((getEndurance() - 10) / 2));
    setAc(10 + getEndurance());
    setMonsterHp(getHitPointsModifier());
    setAc(10 + getEndurance());
  }
}
