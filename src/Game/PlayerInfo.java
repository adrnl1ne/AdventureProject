package Game;

public class PlayerInfo {
  //s,p,e,c,i,a,l
  Player warrior = new Player("Warrior", 1, 0, 13, 15, 12, 14, 10, 10, 13, 10);
  Player mage = new Player("Mage", 1, 0, 9, 9, 12, 11, 11, 17, 14, 9);
  Player ranger = new Player("Ranger", 1, 0, 10, 11, 11, 16, 8, 18, 9, 10);
  Player bard = new Player("Bard", 1, 0, 10, 11, 13, 12, 14, 10, 14, 12);
  Player empty = new Player("Default", 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);


  Player currentClass = empty;


  public void checkStats() {
    System.out.println(currentClass);
  }




}
