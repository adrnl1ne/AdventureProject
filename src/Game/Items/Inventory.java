package Game.Items;


import java.util.HashMap;

public class Inventory {

  // TODO: 25-03-2022 convert arraylist to hashmap
  public HashMap<String, Item> allItems = new HashMap<>();
  public HashMap<String, Item> playerInventory = new HashMap<>();


  public void generateAllItems() {


    Weapon longSword = new Weapon(2, 0);
    Weapon orbOfFire = new Weapon(2, 0);
    Weapon longbow = new Weapon(2, 0);
    Weapon dagger = new Weapon(2, 0);
    Armor shield = new Armor(0, 2);

    allItems.put("longsword", longSword);
    allItems.put("orbOfFire", orbOfFire);
    allItems.put("longbow", longbow);
    allItems.put("dagger", dagger);
    allItems.put("shield", shield);

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
    playerInventory.put("OrbOfFire", allItems.get("OrbOfFire"));
  }

  public void startItemsRanger() {
    playerInventory.put("Longbow", allItems.get("Longbow"));
  }

  public void startItemsBard() {
    playerInventory.put("Dagger", allItems.get("Dagger"));
  }

}
