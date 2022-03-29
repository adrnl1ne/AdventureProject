package Game;


import java.util.Locale;
import java.util.Scanner;

public class Interface {
  Scanner input = new Scanner(System.in);
  private int introInput;

  public void greetPlayer() {
    // TODO: 29-03-2022 implement background music
    //playMusic.playMusic();
    System.out.println("""
        Welcome to the AMAZING GAME OF ADVENTURE TIME!
        please choose what you would like to do
        1) Embark on your epic adventure 
        2) End your adventure 
        3) help menu");        
        """);
    //introInput = input.nextInt();
    //startMenu();
  }

  public String getUserInput() {
    return input.nextLine().toLowerCase(Locale.ROOT);
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
  }


  public void startMenu() {
    /*switch (introInput) {
      case 1 ->*/
  }


}

