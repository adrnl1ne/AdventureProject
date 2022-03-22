package Game;

import java.io.IOException;

public class Controller {
  Interface userInterface = new Interface();
  RoomController roomController = new RoomController();
  RoomDecider roomDecider = new RoomDecider();
  RandomGenerator randomGenerator = new RandomGenerator();
  PlayerInfo playerInfo = new PlayerInfo();
  Inventory inventory = new Inventory();
  Encounter encounter = new Encounter();

  boolean isRunning = true;

  public Controller() throws IOException {
  }

  public void run() throws InterruptedException{
    System.out.println("fuck");
    roomController.createMap();
    userInterface.greetPlayer();
    chooseClass();
    inventory.giveStarterItems(playerInfo);
    roomDecider.chooseRoom(randomGenerator);
    startingRoom(roomController.currentRoom);
    while (isRunning) {
      System.out.println(roomController.currentRoom.getDescription());
      roomController.exploreChecker();
      menu();
    }
  }

  public void menu() {
    userInterface.doStuff();
    switch (userInterface.in) {
      case "travel" -> travel(roomController.currentRoom);
      case "explore" -> encounter.encounter(roomController);
      case "stats" -> playerInfo.checkStats();
      case "inventory" -> inventory.checkInventory();
      case "help" -> userInterface.help();
      case "exit" -> isRunning = false;
    }
  }


  public void travel(Room currentRoom) {

    userInterface.callUserInput();
    switch (userInterface.in) {
      case "north", "n" -> roomController.currentRoom = userInterface.goNorth(currentRoom);
      case "south", "s" -> roomController.currentRoom = userInterface.goSouth(currentRoom);
      case "west", "w" -> roomController.currentRoom = userInterface.goWest(currentRoom);
      case "east", "e" -> roomController.currentRoom = userInterface.goEast(currentRoom);
    }
  }

  public void startingRoom(Room currentRoom) {
    switch (roomDecider.dice) {
      case 4 -> roomController.currentRoom = roomDecider.meadows2(currentRoom);
      case 3 -> roomController.currentRoom = roomDecider.meadows(currentRoom);
      case 2 -> roomController.currentRoom = roomDecider.forest2(currentRoom);
      case 1 -> roomController.currentRoom = roomDecider.forest(currentRoom);
    }
  }

  public void chooseClass() {
    userInterface.chooseClass();
    switch (userInterface.in) {
      case "warrior", "w" -> playerInfo.currentClass = playerInfo.warrior;
      case "mage", "m" -> playerInfo.currentClass = playerInfo.mage;
      case "ranger", "r" -> playerInfo.currentClass = playerInfo.ranger;
      case "bard", "b" -> playerInfo.currentClass = playerInfo.bard;
    }
  }
}