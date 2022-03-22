package Game;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

  String[] items = {""};

  ArrayList<String> playerInventory = new ArrayList<>(List.of(items));

  public void checkInventory() {
    System.out.println(playerInventory);
  }

  public void giveStarterItems(PlayerInfo playerInfo) {
    playerInventory.clear();
    if (playerInfo.currentClass == playerInfo.warrior) {
      playerInventory.add("Longsword");
      playerInventory.add("Shield");
    } else if (playerInfo.currentClass == playerInfo.mage) {
      playerInventory.add("Bent quarter staff");
      playerInventory.add("Orb of light");
    } else if (playerInfo.currentClass == playerInfo.ranger) {
      playerInventory.add("Longbow");
      playerInventory.add("Looking glass");
    } else if (playerInfo.currentClass == playerInfo.bard) {
      playerInventory.add("Dagger");
      playerInventory.add("Lute");
    }
  }

}
