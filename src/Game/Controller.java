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
    roomController.createMap();
    userInterface.greetPlayer();
    chooseClass();
    inventory.giveStarterItems(playerInfo);
    roomDecider.chooseRoom(randomGenerator);
    startingRoom(roomController.getCurrentRoom());
    while (isRunning) {
      System.out.println(roomController.getCurrentRoom().getDescription());
      roomController.exploreChecker();
      menu();
    }
  }

  public void menu() {
    userInterface.doStuff();
    switch (userInterface.in) {
      case "travel" -> travel();
      case "explore" -> encounter.encounter(roomController);
      case "stats" -> playerInfo.checkStats();
      case "inventory" -> inventory.checkInventory();
      case "help" -> userInterface.help();
      case "exit" -> isRunning = false;
    }
  }


  public void travel() {

    userInterface.callUserInput();
    switch (userInterface.in) {
      case "north", "n" -> roomController.currentRoom = roomController.goNorth();
      case "south", "s" -> roomController.currentRoom = roomController.goSouth();
      case "west", "w" -> roomController.currentRoom = roomController.goWest();
      case "east", "e" -> roomController.currentRoom = roomController.goEast();
    }
  }

  public void startingRoom(Room currentRoom) {
    switch (roomDecider.dice) {
      case 4 -> roomController.setCurrentRoom(roomDecider.meadows2(currentRoom));
      case 3 -> roomController.setCurrentRoom(roomDecider.meadows(currentRoom));
      case 2 -> roomController.setCurrentRoom(roomDecider.forest2(currentRoom));
      case 1 -> roomController.setCurrentRoom(roomDecider.forest(currentRoom));
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