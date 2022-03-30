package Game;

import Game.Items.Armor;
import Game.Items.Item;
import Game.Items.Weapon;

import java.util.HashMap;

public class Inventory {

  // TODO: 25-03-2022 convert arraylist to hashmap
  HashMap<String, Item> allItems = new HashMap<>();
  HashMap<String, Item> playerInventory = new HashMap<>();


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

}
