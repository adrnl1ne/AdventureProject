package Game.NPC;

public class Minotaur extends Monster{

  public Minotaur() {
    super();
    setStrength(20);
    setEndurance(20);
    setIntelligence(randomGenerator.stat());
    setAgility(randomGenerator.stat());
    setHitPointsModifier(30 + ((getEndurance() - 10) / 2));
    setMonsterHp(getHitPointsModifier());
    setAc(10 + getEndurance());
  }

}
