package Game;

import Game.Items.Inventory;
import Game.MapStuff.Encounter;
import Game.MapStuff.Map;
import Game.MapStuff.Room;
import Game.MapStuff.RoomDecider;
import Game.Player.PlayerInfo;
import Game.Player.PlayerClasses.Bard;
import Game.Player.PlayerClasses.Mage;
import Game.Player.PlayerClasses.Ranger;
import Game.Player.PlayerClasses.Warrior;

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
    map.setMap();
    startingRoom(map.getCurrentRoom());
    map.discoverRoom(map.getCurrentRoom());
    while (isRunning) {
      System.out.println(map.getCurrentRoom().getDescription());
      map.exploreChecker();
      menu();
    }
  }

  public void menu() {
    userInterface.chooseAction();
    switch (userInterface.getIntInput()) {
      case 1 -> travel();
      case 2 -> encounter.encounter(map);
      case 3 -> map.drawMap();
      case 4 -> playerInfo.checkStats();
      case 5 -> inventory.checkInventory();
      case 6 -> userInterface.help();
      case 7 -> isRunning = false;
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
        inventory.startItemsWarrior();
      }
      case "mage", "m" -> {
        playerInfo.setChosenClass(new Mage());
        inventory.startItemsMage();
      }
      case "ranger", "r" -> {
        playerInfo.setChosenClass(new Ranger());
        inventory.startItemsRanger();
      }
      case "bard", "b" -> {
        playerInfo.setChosenClass(new Bard());
        inventory.startItemsBard();
      }

    }
  }
}