package Game;

import java.util.Random;

  public class RandomGenerator {
    Random rollDice = new Random();
    Random hpRandom = new Random();
    private int dice;


    public int callRoomDice() {
      rollForRoom();
      return dice;
    }

    public void rollForRoom() {
      dice = rollDice.nextInt(4) + 1;
    }


  }

