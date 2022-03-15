package Game;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EnvironmentGenerator {
  Path forest = Path.of("Rooms\\forest.txt");
  Path deepForest = Path.of("Rooms\\deepForest.txt");
  Path cave = Path.of("Rooms\\cave.txt");
  Path lake = Path.of("Rooms\\lake.txt");
  Path meadows = Path.of("Rooms\\meadows.txt");
  Path mountains = Path.of("Rooms\\mountains.txt");
  Path village = Path.of("Rooms\\village.txt");



  public void forest() throws IOException {
    //boar
    String str = Files.readString(forest);
    System.out.println(str);
  }

  public void deepForest() throws IOException {
    //big ass spider
    String str = Files.readString(deepForest);
    System.out.println(str);
  }

  public void cave() throws IOException {
    //white dragon
    String str = Files.readString(cave);
    System.out.println(str);
  }

  public void meadow() throws IOException {
    String str = Files.readString(meadows);
    System.out.println(str);
  }

  public void mountains() throws IOException {
    //yeti
    String str = Files.readString(mountains);
    System.out.println(str);
  }

  public void abandonedVillage() throws IOException {
    String str = Files.readString(village);
    System.out.println(str);
  }

  public void lake() throws IOException {
    //Nessie
    String str = Files.readString(lake);
    System.out.println(str);
  }

}
