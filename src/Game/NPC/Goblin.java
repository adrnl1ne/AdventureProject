package Game.NPC;

public class Goblin extends Monster{

  public Goblin() {
    super();
    setStrength(6);
    setEndurance(6);
    setIntelligence(randomGenerator.stat());
    setAgility(randomGenerator.stat());
    setHitPointsModifier(6 + ((getEndurance() - 10) / 2));
    setMonsterHp(getHitPointsModifier());
    setAc(10 + getEndurance());
  }
}
