package Game.MapStuff;

public class Room {

  private final int number;
  private final String description;
  private Room north;
  private Room south;
  private Room east;
  private Room west;

  //constructor
  public Room(int number, String description) {
    this.number = number;
    this.description = description;
  }

  public void setNorth(Room north) {
    this.north = north;
  }

  public void setSouth(Room south) {
    this.south = south;
  }

  public void setEast(Room east) {
    this.east = east;
  }

  public void setWest(Room west) {
    this.west = west;
  }

  public Room getNorth() {
    return north;
  }

  public Room getSouth() {
    return south;
  }

  public Room getEast() {
    return east;
  }

  public Room getWest() {
    return west;
  }

  //getter
  public String getDescription() {
    return description;
  }

  public int getNumber() {
    return number;
  }



}

