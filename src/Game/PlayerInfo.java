package Game;

public class PlayerInfo {
  RandomGenerator randomGenerator = new RandomGenerator();

  //s,p,e,c,i,a,l
  // Player warrior = new Player("Warrior", 1, 0, 13, 15, 12, 14, 10, 10, 13, 10);
  //Player mage = new Player("Mage", 1, 0, 9, 9, 12, 11, 11, 17, 14, 9);
  //Player ranger = new Player("Ranger", 1, 0, 10, 11, 11, 16, 8, 18, 9, 10);
  //Player bard = new Player("Bard", 1, 0, 10, 11, 13, 12, 14, 10, 14, 12);
  //Player empty = new Player("Default", 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);


  private Player currentClass;


  public void checkStats() {
    System.out.println(currentClass);
  }


  public Player getCurrentClass() {
    return currentClass;
  }

  public void setChosenClass(Player currentClass) {
    this.currentClass = currentClass;
    //todo decide where to calculate hit points - rename method
    hitPoints();
  }

  public void hitPoints() {
    //TODO - set hp modifiers
        /*
        Warrior - 10
        Wizard - 4
        Ranger - 8
        Bard - 6
         */
    currentClass.setHp(randomGenerator.hpRandom.nextInt(currentClass.getHitPointsModifier()) +
        1 + ((currentClass.getEndurance() - 10) / 2));
  }


}
