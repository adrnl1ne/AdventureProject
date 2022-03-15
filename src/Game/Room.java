package Game;

import java.io.IOException;

public class Room {
  EnvironmentGenerator environmentGenerator = new EnvironmentGenerator();
  Interface userInterface = new Interface();



  public void room1() throws IOException {
    //East or South
    /*forest1.getNumber();
    System.out.println(forest1.getDescription());*/
    userInterface.timeToMove();
    if (userInterface.in.contains("E")) {
      room2();
    } else if (userInterface.in.contains("S")) {
      room4();
    } else {
      System.out.println("You can't go that way");
    }
    room1();
  }

  public void room2() throws IOException {
    //East or West
    environmentGenerator.deepForest();
    userInterface.timeToMove();
    if (userInterface.in.contains("E")) {
      room3();
    } else if (userInterface.in.contains("W")) {
      room1();
    } else {
      System.out.println("You can't go that way");
    }
    room2();
  }

  public void room3() throws IOException {
    //West or South
    environmentGenerator.forest();
    userInterface.timeToMove();
    if (userInterface.in.contains("W")) {
      room2();
    } else if (userInterface.in.contains("S")) {
      room6();
    } else {
      System.out.println("You can't go that way");
    }
    room3();
  }

  public void room4() throws IOException {
    //North or South
    environmentGenerator.lake();
    userInterface.timeToMove();
    if (userInterface.in.contains("N")) {
      room1();
    } else if (userInterface.in.contains("S")) {
      room7();
    } else {
      System.out.println("You can't go that way");
    }
    room4();
  }

  public void room5() throws IOException {
    //South
    environmentGenerator.cave();
    userInterface.timeToMove();
    if (userInterface.in.contains("S")) {
      room8();
    } else {
      System.out.println("You can't go that way");
    }
    room5();
  }

  public void room6() throws IOException {
    //North or South
    environmentGenerator.abandonedVillage();
    userInterface.timeToMove();
    if (userInterface.in.contains("N")) {
      room3();
    } else if (userInterface.in.contains("S")) {
      room9();
    } else {
      System.out.println("You can't go that way");
    }
    room6();
  }

  public void room7() throws IOException {
    //East or North
    environmentGenerator.meadow();
    userInterface.timeToMove();
    if (userInterface.in.contains("E")) {
      room8();
    } else if (userInterface.in.contains("N")) {
      room4();
    } else {
      System.out.println("You can't go that way");
    }
    room7();
  }

  public void room8() throws IOException {
    //East or West Or North
    environmentGenerator.mountains();
    userInterface.timeToMove();
    if (userInterface.in.contains("E")) {
      room9();
    } else if (userInterface.in.contains("W")) {
      room7();
    } else if (userInterface.in.contains("N")) {
      room5();
    } else {
      System.out.println("You can't go that way");
    }
    room8();
  }

  public void room9() throws IOException {
    //North or West
    environmentGenerator.meadow();
    userInterface.timeToMove();
    if (userInterface.in.contains("N")) {
      room6();
    } else if (userInterface.in.contains("W")) {
      room8();
    } else {
      System.out.println("You can't go that way");
    }
    room9();
  }



}
