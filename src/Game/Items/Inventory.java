package Game.Items;


import java.util.HashMap;

public class Inventory {


  HashMap<String, Item> allItems = new HashMap<>();
  HashMap<String, Item> playerInventory = new HashMap<>();


  public void generateAllItems() {


    Weapon longSword = new Weapon(4, 0);
    Weapon orbOfFire = new Weapon(4, 0);
    Weapon longbow = new Weapon(2, 0);
    Weapon dagger = new Weapon(2, 0);
    Weapon wand = new Weapon(3, 0);
    Weapon axe = new Weapon(2, 0);
    Armor steelArmor = new Armor(0, 4);
    Armor shield = new Armor(0, 2);
    Util torch = new Util(0, 0);
    Util luckyCoin = new Util(1, 0);
    Util orbOfLight = new Util(0, 1);
    Util loafOfBread = new Util(0, 0);
    Util brokenArrow = new Util(0, 0);


    allItems.put("Longsword", longSword);
    allItems.put("Orb Of Fire", orbOfFire);
    allItems.put("Longbow", longbow);
    allItems.put("Dagger", dagger);
    allItems.put("Wand", wand);
    allItems.put("Shield", shield);
    allItems.put("Axe", axe);
    allItems.put("Steel Armor", steelArmor);
    allItems.put("Torch", torch);
    allItems.put("Lucky Coin", luckyCoin);
    allItems.put("Orb Of Light", orbOfLight);
    allItems.put("Loaf Of Bread", loafOfBread);
    allItems.put("Broken Arrow", brokenArrow);
  }


  public void checkInventory() {
    for (String i : playerInventory.keySet()) {
      System.out.println(i);
    }
  }

  public void startItemsWarrior() {
    playerInventory.put("Longsword", allItems.get("Longsword"));
    playerInventory.put("Shield", allItems.get("Shield"));
  }

  public void startItemsMage() {
    playerInventory.put("Orb Of Fire", allItems.get("Orb Of Fire"));
  }

  public void startItemsRanger() {
    playerInventory.put("Longbow", allItems.get("Longbow"));
  }

  public void startItemsBard() {
    playerInventory.put("Dagger", allItems.get("Dagger"));
  }

}
