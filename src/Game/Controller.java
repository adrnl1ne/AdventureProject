package Game;

import java.io.IOException;

public class Controller {
  Interface useInterface = new Interface();
  RoomDecider roomDecider = new RoomDecider();
  EnvironmentGenerator environmentGenerator = new EnvironmentGenerator();

  public void run() throws InterruptedException, IOException {
    useInterface.greetPlayer();
    roomDecider.decideRoom();
  }

}
