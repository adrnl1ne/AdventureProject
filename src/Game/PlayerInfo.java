package Game;

public class PlayerInfo {
  //s,p,e,c,i,a,l

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
  }


}
