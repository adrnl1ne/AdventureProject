package Game;

import java.io.IOException;

public class RoomDecider {
  RandomGenerator randomGenerator = new RandomGenerator();
  Room room = new Room();



  public void decideRoom() throws IOException {
    chooseRoom(randomGenerator);
  }

  public void chooseRoom(RandomGenerator randomGenerator) throws IOException {
    if (randomGenerator.callRoomDice() == 4) {
      //Call room 9
      room.room9();
    } else if (randomGenerator.callRoomDice() == 3) {
      //Call room 7
      room.room7();
    } else if (randomGenerator.callRoomDice() == 2) {
      //Call room 3
      room.room3();
    } else {
      //Call room 1
      room.room1();
    }
  }

}
