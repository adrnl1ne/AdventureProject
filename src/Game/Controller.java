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
  Combat combat = new Combat();
  Music music = new Music();

  boolean isRunning = true;

  public Controller() throws IOException {
  }

  public void run() {
    music.playMusic();
    map.createMap();
    inventory.generateAllItems();
    userInterface.greetPlayer();
    startMenu();
    roomDecider.chooseRoom(randomGenerator);
    map.setMap();
    startingRoom(map.getCurrentRoom());
    while (isRunning) {
      map.discoverRoom(map.getCurrentRoom());
      System.out.println(map.getCurrentRoom().getDescription());
      encounter.encounter(combat, playerInfo);
      menu();
      checkForLive();
    }
  }

  public void menu() {
    userInterface.chooseAction();
    switch (userInterface.getIntInput()) {
      case 1 -> travel();
      case 2 -> inventory.equip();
      case 3 -> map.drawMap();
      case 4 -> playerInfo.checkStats();
      case 5 -> inventory.checkInventory();
      case 6 -> userInterface.help();
      case 7 -> isRunning = false;
    }
  }


  public void startMenu() {
    switch (userInterface.getIntInput()) {
      case 1 -> chooseClass();
      case 2 -> isRunning = false;
      case 3 -> userInterface.help();
    }
  }

  public void travel() {
    System.out.println("""
        In which direction do you wish to travel?
        1) North
        2) South
        3) East
        4) West
        """);
    switch (userInterface.getIntInput()) {
      case 1 -> map.setCurrentRoom(map.goNorth());
      case 2 -> map.setCurrentRoom(map.goSouth());
      case 3 -> map.setCurrentRoom(map.goEast());
      case 4 -> map.setCurrentRoom(map.goWest());
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
    switch (userInterface.getIntInput()) {
      case 1 -> {
        playerInfo.setChosenClass(new Warrior());
        inventory.startItemsWarrior();
      }
      case 2 -> {
        playerInfo.setChosenClass(new Mage());
        inventory.startItemsMage();
      }
      case 3 -> {
        playerInfo.setChosenClass(new Ranger());
        inventory.startItemsRanger();
      }
      case 4 -> {
        playerInfo.setChosenClass(new Bard());
        inventory.startItemsBard();
      }

    }
  }

  public void checkForLive() {
    if (playerInfo.getCurrentClass().getHitPoints() <= 0) {
      isRunning = false;
      System.out.println("Game Over");
    }
  }
}