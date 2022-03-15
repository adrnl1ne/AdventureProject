package Game;


import java.util.Scanner;

public class Interface {
Scanner input = new Scanner(System.in);
  String in;

  public void greetPlayer() throws InterruptedException {
    System.out.println("Welcome to the adventure game!\nAre you ready to play?");
    callUserInput();
    checkForReady();
  }


  public String getUserInput() {
    return input.nextLine();
  }

  public void callUserInput(){
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
      Thread.sleep(2000);
      greetPlayer();
    }
  }




  public void timeToMove() {
    in = "";
    chooseAction();
    travelOrExplore();
  }

  public void chooseAction() {
    System.out.println("What do you want to do?");
    System.out.println("Explore");
    System.out.println("Travel");
    //System.out.println("Rest");
    callUserInput();
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
    callUserInput();
  }
  }

