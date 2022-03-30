package Game.MapStuff;

import java.io.IOException;

public class Map {

  EnvironmentGenerator environmentGenerator = new EnvironmentGenerator();

  Room room1 = new Room(1, environmentGenerator.forest());
  Room room2 = new Room(2, environmentGenerator.deepForest());
  Room room3 = new Room(3, environmentGenerator.forest());
  Room room4 = new Room(4, environmentGenerator.lake());
  Room room5 = new Room(5, environmentGenerator.cave());
  Room room6 = new Room(6, environmentGenerator.abandonedVillage());
  Room room7 = new Room(7, environmentGenerator.meadow());
  Room room8 = new Room(8, environmentGenerator.mountains());
  Room room9 = new Room(9, environmentGenerator.meadow());
  Room room10 = new Room(10, environmentGenerator.blank());
  Room room11 = new Room(11, environmentGenerator.blank());
  Room room12 = new Room(12, environmentGenerator.blank());
  Room room13 = new Room(13, environmentGenerator.blank());
  Room room14 = new Room(14, environmentGenerator.blank());
  Room room15 = new Room(15, environmentGenerator.blank());
  Room room16 = new Room(16, environmentGenerator.blank());
  Room room17 = new Room(17, environmentGenerator.blank());
  Room room18 = new Room(18, environmentGenerator.blank());
  Room room19 = new Room(19, environmentGenerator.blank());
  Room room20 = new Room(20, environmentGenerator.blank());
  Room room21 = new Room(21, environmentGenerator.blank());
  Room room22 = new Room(22, environmentGenerator.blank());
  Room room23 = new Room(23, environmentGenerator.blank());
  Room room24 = new Room(24, environmentGenerator.blank());
  Room room25 = new Room(25, environmentGenerator.blank());
  Room room26 = new Room(26, environmentGenerator.blank());
  Room room27 = new Room(27, environmentGenerator.blank());
  Room room28 = new Room(28, environmentGenerator.blank());
  Room room29 = new Room(29, environmentGenerator.blank());
  Room room30 = new Room(30, environmentGenerator.blank());
  Room room31 = new Room(31, environmentGenerator.blank());
  Room room32 = new Room(32, environmentGenerator.blank());
  Room room33 = new Room(33, environmentGenerator.blank());


  Room preSpawn = new Room(10, environmentGenerator.theVoid());

  //Explore part
  Room exploreForest = new Room(1, environmentGenerator.exploreForest1());
  Room exploreDeepForest = new Room(2, environmentGenerator.exploreDeepForest());
  Room exploreForest2 = new Room(3, environmentGenerator.exploreForest2());
  Room exploreLake = new Room(4, environmentGenerator.exploreLake());
  Room exploreCave = new Room(5,environmentGenerator.exploreCave());
  Room exploreVillage = new Room(6, environmentGenerator.exploreVillage());
  Room exploreMeadows = new Room(7, environmentGenerator.exploreMeadows());
  Room exploreMountains = new Room(8, environmentGenerator.exploreMountains());
  Room exploreMeadows2 = new Room(9, environmentGenerator.exploreMeadows2());

  private Room currentRoom = preSpawn;
  Room currentExplore = exploreForest;

  public Map() throws IOException {
  }


  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room room) {
    this.currentRoom = room;
  }

  public Room getCurrentExplore() {
    return currentExplore;
  }

  public void createMap() {
    //Room1
    room1.setEast(room2);
    room1.setSouth(room4);
    //Room2
    room2.setEast(room3);
    room2.setWest(room1);
    //Room3
    room3.setSouth(room6);
    room3.setWest(room2);
    //Room4
    room4.setNorth(room1);
    room4.setSouth(room7);
    //Room5
    room5.setSouth(room8);
    //Room6
    room6.setNorth(room3);
    //cave.setEast(null);
    room6.setSouth(room9);
    //Room7
    room7.setNorth(room4);
    room7.setEast(room8);
    //Room8
    room8.setNorth(room5);
    room8.setEast(room9);
    room8.setWest(room7);
    //Room9
    room9.setNorth(room6);
    room9.setWest(room8);
    room9.setEast(room31);
    //Room10
    room10.setNorth(room11);
    //Room11 room is dark, use random gen if no torch
    room11.setNorth(room13);
    room11.setSouth(room10);
    room11.setWest(room14);
    room11.setEast(room12);
    //Room12
    room12.setNorth(room16);
    //Room13
    room13.setNorth(room17);
    room13.setSouth(room11);
    room13.setWest(room15);
    room13.setEast(room16);
    //Room14
    room14.setNorth(room15);
    //Room15
    room15.setEast(room13);
    //Room16
    room16.setWest(room13);
    //Room17
    room17.setSouth(room13);
    room17.setEast(room18);
    //Room18
    room18.setWest(room17);
    room18.setSouth(room3);
    //Room19 entrance to dungeon
    room19.setWest(room20);
    room19.setWest(room4);
    //Room20
    room20.setNorth(room21);
    room20.setWest(room31);
    //Room21
    room21.setNorth(room22);
    room21.setSouth(room20);
    //Room22
    room22.setSouth(room21);
    room22.setWest(room23);
    //Room23
    room23.setWest(room24);
    room23.setEast(room22);
    //Room24
    room24.setWest(room25);
    room24.setEast(room23);
    //Room25
    room25.setSouth(room26);
    room25.setEast(room24);
    //Room26 bossRoom/fight
    room26.setNorth(room25);
    room26.setSouth(room28);
    room26.setWest(room27);
    //Room27
    room27.setEast(room26);
    //Room28
    room28.setNorth(room26);
    room28.setEast(room29);
    //Room29
    room29.setEast(room30);
    room29.setWest(room28);
    //Room30
    room30.setEast(room20);
    room30.setWest(room29);
    //Room31
    room31.setSouth(room32);
    //Room32
    room32.setWest(room33);
    //Room33
    room33.setNorth(room9);

    //Room Void
    preSpawn.setNorth(room1);
    preSpawn.setSouth(room3);
    preSpawn.setEast(room7);
    preSpawn.setWest(room9);
  }




  public void exploreChecker() {
    if (currentRoom == room1) {
      currentExplore = exploreForest;
    } else if (currentRoom == room3) {
      currentExplore = exploreForest2;
    } else if (currentRoom == room4) {
      currentExplore = exploreLake;
    } else if (currentRoom == room6) {
      currentExplore = exploreVillage;
    } else if (currentRoom == room7) {
      currentExplore = exploreMeadows;
    } else if (currentRoom == room9) {
      currentExplore = exploreMeadows2;
    } else if (currentRoom == room8) {
      currentExplore = exploreMountains;
    } else if (currentRoom == room5) {
      currentExplore = exploreCave;
    } else if (currentRoom == room2) {
      currentExplore = exploreDeepForest;
    }
  }


  public Room goNorth() {
    if (currentRoom.getNorth() != null) {
      return currentRoom.getNorth();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }

  public Room goSouth() {
    if (currentRoom.getSouth() != null) {
      return currentRoom.getSouth();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }

  public Room goEast() {
    if (currentRoom.getEast() != null) {
      return currentRoom.getEast();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }

  public Room goWest() {
    if (currentRoom.getWest() != null) {
      return currentRoom.getWest();
    } else {
      System.out.println("You cant go that way!");
      return currentRoom;
    }
  }


}
