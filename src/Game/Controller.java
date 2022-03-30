package Game;

import Game.MapStuff.Map;
import Game.MapStuff.Room;
import Game.MapStuff.RoomDecider;
import Game.PlayerClasses.Bard;
import Game.PlayerClasses.Mage;
import Game.PlayerClasses.Ranger;
import Game.PlayerClasses.Warrior;

import java.io.IOException;

public class Controller {
  Interface userInterface = new Interface();
  Map map = new Map();
  RoomDecider roomDecider = new RoomDecider();
  RandomGenerator randomGenerator = new RandomGenerator();
  PlayerInfo playerInfo = new PlayerInfo();
  Encounter encounter = new Encounter();
  Inventory inventory = new Inventory();

  boolean isRunning = true;

  public Controller() throws IOException {
  }

  public void run() {
    map.createMap();
    inventory.generateAllItems();
    userInterface.greetPlayer();
    chooseClass();
    roomDecider.chooseRoom(randomGenerator);
    startingRoom(map.getCurrentRoom());
    while (isRunning) {
      System.out.println(map.getCurrentRoom().getDescription());
      map.exploreChecker();
      menu();
    }
  }

  public void menu() {
    userInterface.chooseAction();
    switch (userInterface.getUserInput()) {
      case "travel" -> travel();
      case "explore" -> encounter.encounter(map);
      case "stats" -> playerInfo.checkStats();
      case "inventory" -> inventory.checkInventory();
      case "help" -> userInterface.help();
      case "exit" -> isRunning = false;
    }
  }


  public void travel() {
    System.out.println("""
        In which direction do you wish to travel?
        North
        South
        East
        West
        """);
    switch (userInterface.getUserInput()) {
      case "north", "n" -> map.setCurrentRoom(map.goNorth());
      case "south", "s" -> map.setCurrentRoom(map.goSouth());
      case "west", "w" -> map.setCurrentRoom(map.goWest());
      case "east", "e" -> map.setCurrentRoom(map.goEast());
    }
  }

  public void startingRoom(Room currentRoom) {
    switch (roomDecider.getDice()) {
      case 4 -> map.setCurrentRoom(roomDecider.meadows2(currentRoom));
      case 3 -> map.setCurrentRoom(roomDecider.meadows(currentRoom));
      case 2 -> map.setCurrentRoom(roomDecider.forest2(currentRoom));
      case 1 -> map.setCurrentRoom(roomDecider.forest(currentRoom));
    }
  }

  public void chooseClass() {
    userInterface.chooseClass();
    switch (userInterface.getUserInput()) {
      case "warrior", "w" -> {
        playerInfo.setChosenClass(new Warrior());
        inventory.playerInventory.put("Longsword", inventory.allItems.get("Longsword"));
        inventory.playerInventory.put("Shield", inventory.allItems.get("Shield"));
      }
      case "mage", "m" -> {
        playerInfo.setChosenClass(new Mage());
        inventory.playerInventory.put("OrbOfFire", inventory.allItems.get("OrbOfFire"));
      }
      case "ranger", "r" -> {
        playerInfo.setChosenClass(new Ranger());
        inventory.playerInventory.put("Longbow", inventory.allItems.get("Longbow"));
      }
      case "bard", "b" -> {
        playerInfo.setChosenClass(new Bard());
        inventory.playerInventory.put("Dagger", inventory.allItems.get("Dagger"));
      }
    }
  }
}