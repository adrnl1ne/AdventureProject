package Game;

import java.nio.file.Path;

  public class RoomGenerator {
    private int number;
    private Path description;
    private Game.RoomGenerator north;
    private Game.RoomGenerator south;
    private Game.RoomGenerator east;
    private Game.RoomGenerator west;

    //constructor
    public RoomGenerator(int number, Path description) {
      this.number = number;
      this.description = description;
    }

    public void setNorth(Game.RoomGenerator north) {
      this.north = north;
      this.west = west;
    }
    public void setSouth(Game.RoomGenerator south) {
      this.south = south;
    }

    public void setEast(Game.RoomGenerator east) {
      this.east = east;
    }

    public void setWest(Game.RoomGenerator west) {
      this.west = west;
    }

    Game.RoomGenerator getNorth() {
      return north;
    }

    Game.RoomGenerator getSouth() {
      return south;
    }

    Game.RoomGenerator getEast() {
      return east;
    }

    Game.RoomGenerator getWest() {
      return west;
    }

    Path getDescription() {
      return description;
    }

    int getNumber() {
      return number;
    }
  }

