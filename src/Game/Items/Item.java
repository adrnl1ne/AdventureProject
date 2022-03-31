package Game.Items;

public class Item {
  private String itemClass;
  private int dmg;
  private int def;

  public Item(int dmg, int def) {
    this.dmg = dmg;
    this.def = def;
  }

  public int getDef() {
    return def;
  }

  public int getDmg() {
    return dmg;
  }
}
