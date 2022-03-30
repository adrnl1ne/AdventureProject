package Game.MapStuff;


import Game.RandomGenerator;

public class RoomDecider {
  int dice;

  public int getDice() {
    return dice;
  }

  public void chooseRoom(RandomGenerator randomGenerator) {
    dice = returnDice(randomGenerator);
  }

  public int returnDice(RandomGenerator randomGenerator) {
    return randomGenerator.callRoomDice();
  }

 public Room forest(Room currentRoom) {
    if (currentRoom.getNorth() != null) {
      return currentRoom.getNorth();
    } else {
      return currentRoom;
    }
  }

 public Room forest2(Room currentRoom) {
    if (currentRoom.getSouth() != null) {
      return currentRoom.getSouth();
    } else {
      return currentRoom;
    }
  }

  public Room meadows(Room currentRoom) {
    if (currentRoom.getEast() != null) {
      return currentRoom.getEast();
    } else {
      return currentRoom;
    }
  }

 public Room meadows2(Room currentRoom) {
    if (currentRoom.getWest() != null) {
      return currentRoom.getWest();
    } else {
      return currentRoom;
    }
  }
}

