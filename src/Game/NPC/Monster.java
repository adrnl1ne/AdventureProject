package Game.NPC;

import Game.RandomGenerator;

public class Monster extends NPC {
  RandomGenerator randomGenerator = new RandomGenerator();

  public Monster() {
    super();
    setStrength(randomGenerator.stat());
    setEndurance(randomGenerator.stat());
    setIntelligence(randomGenerator.stat());
    setAgility(randomGenerator.stat());
    setHitPointsModifier(randomGenerator.stat() + ((getEndurance() - 10) / 2));
    setAc(10 + getEndurance());
    setMonsterHp(getHitPointsModifier());
  }



}
