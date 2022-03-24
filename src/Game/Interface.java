package Game;


import java.util.Locale;
import java.util.Scanner;

public class Interface {
  Scanner input = new Scanner(System.in);
  String in;

  public void greetPlayer() throws InterruptedException {
    System.out.println("""
        Welcome to the adventure game!
        Are you ready to play?""");
    callUserInput();
    checkForReady();
  }

  public String getUserInput() {
    return input.nextLine().toLowerCase(Locale.ROOT);
  }

  public void callUserInput() {
    in = getUserInput();
  }

  public void checkForReady() throws InterruptedException {
    if (in.contains("y")) {
      System.out.println("Great, let's get started!");
      Thread.sleep(1500);
      System.out.println("""
                    
                    
                    
                    
                    
                    
          """);
    } else {
      System.out.println("I'm sorry to hear that...");
      Thread.sleep(1500);
      greetPlayer();
    }
  }

  public void doStuff() {
    chooseAction();
    travelOrExplore();
  }

  public void chooseAction() {
    System.out.println("""
                
        What do you want to do?
        Check Stats
        Check Inventory
        Explore
        Travel
        Help
        Exit
        """);
    //System.out.println("Rest");
    callUserInput();
  }

  public void help() {
    System.out.println("""
        Welcome to the help menu!
        Type:
         explore   = Looking around at the current location
         travel    = Traveling
         stats     = Checking Stats
         inventory = Checking Inventory
         help      = Opens help menu
         exit      = Exit
        """);
  }

  public void travelOrExplore() {
    if (in.equals("Travel")) {
      chooseDirection();
    }
  }

  public void chooseDirection() {
    System.out.println("""
        In which direction do you want to travel?
        North
        South
        East
        West
        """);
  }

  public void chooseClass() {
    System.out.println("""
        Before we start, dear adventurer
        Please choose your class!
                
        Classes:
        Warrior
        Mage
        Ranger
        Bard
        """);
    callUserInput();
  }


}

