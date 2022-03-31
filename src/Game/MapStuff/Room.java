package Game.MapStuff;

public class Room {

  private final int number;
  private final String description;
  private Room north;
  private Room south;
  private Room east;
  private Room west;
  private boolean visitedRoom = false;

  private int X;
  private int Y;

  //constructor
  public Room(int number, String description) {
    this.number = number;
    this.description = description;
  }

  public void setX(int X) {
    this.X = X;
  }

  public void setY(int Y) {
    this.Y = Y;
  }

  public int getX() {
    return X;
  }

  public int getY() {
    return Y;
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

  //getter and setter for visiting rooms
  public boolean isVisitedRoom()
  {
    return visitedRoom;
  }

  public void setVisitedRoom(boolean visitedRoom)
  {
    this.visitedRoom = visitedRoom;
  }

}

