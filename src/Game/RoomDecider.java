package Game;

public class RoomDecider {
  int dice;

  public void chooseRoom(RandomGenerator randomGenerator) {
    dice = returnDice(randomGenerator);
  }

  public int returnDice(RandomGenerator randomGenerator) {
    return randomGenerator.callRoomDice();
  }

  Room forest(Room currentRoom) {
    if (currentRoom.getNorth() != null) {
      return currentRoom.getNorth();
    } else {
      return currentRoom;
    }
  }

  Room forest2(Room currentRoom) {
    if (currentRoom.getSouth() != null) {
      return currentRoom.getSouth();
    } else {
      return currentRoom;
    }
  }

  Room meadows(Room currentRoom) {
    if (currentRoom.getEast() != null) {
      return currentRoom.getEast();
    } else {
      return currentRoom;
    }
  }

  Room meadows2(Room currentRoom) {
    if (currentRoom.getWest() != null) {
      return currentRoom.getWest();
    } else {
      return currentRoom;
    }
  }
}

