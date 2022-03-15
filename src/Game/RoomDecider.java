package Game;

import java.io.IOException;
import java.nio.file.Path;

public class RoomDecider {
  RandomGenerator randomGenerator = new RandomGenerator();
  EnvironmentGenerator environmentGenerator = new EnvironmentGenerator();
  Room room = new Room();
  private int dice;

  public void decideRoom() throws IOException {
    chooseRoom(randomGenerator);
  }

  public void chooseRoom(RandomGenerator randomGenerator) throws IOException {
   dice = randomGenerator.callRoomDice();
    if (dice == 4) {
      //Call room 9
      room.room9();
    } else if (dice == 3) {
      //Call room 7
      room.room7();
    } else if (dice == 2) {
      //Call room 3
      room.room3();
    } else {
      //Call room 1
      room.room1();
    }
  }

}
