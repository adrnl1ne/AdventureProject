package Game;

import java.util.Random;

public class RandomGenerator {
  Random random = new Random();
  private int dice;


  public int callRoomDice() {
    rollForRoom();
    return dice;
  }

  public int twentySideDice() {
    return random.nextInt(20) + 1;
  }

  public int eightSideDice() {
    return random.nextInt(8) + 1;
  }

  public void rollForRoom() {
    dice = random.nextInt(4) + 1;
  }

  public int stat() {
    return random.nextInt(10) + 1 + 10;
  }


  public int hpWarrior() {
    return random.nextInt(10) + 1;
  }

  public int hpMage() {
    return random.nextInt(4) + 1;
  }

  public int hpRanger() {
    return random.nextInt(8) + 1;
  }

  public int hpBard() {
    return random.nextInt(6) + 1;
  }

}

