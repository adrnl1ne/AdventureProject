package Game.Player.PlayerClasses;

import Game.Player.Player;
import Game.RandomGenerator;

public class Bard extends Player {
  RandomGenerator randomGenerator = new RandomGenerator();
  public Bard() {
    super();
    setLvl(1);
    setExp(0);
    setStrength(randomGenerator.stat());
    setPerception(randomGenerator.stat());
    setEndurance(randomGenerator.stat());
    setCharisma(randomGenerator.stat());
    setIntelligence(randomGenerator.stat());
    setAgility(randomGenerator.stat());
    setLuck(randomGenerator.stat());
    setHitPointsModifier(randomGenerator.hpBard()+(getEndurance()-10)/2);
  }
}
