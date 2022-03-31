package Game.MapStuff;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class  EnvironmentGenerator {
  Path forest = Path.of("Rooms\\forest.txt");
  Path deepForest = Path.of("Rooms\\deepForest.txt");
  Path cave = Path.of("Rooms\\cave.txt");
  Path lake = Path.of("Rooms\\lake.txt");
  Path meadows = Path.of("Rooms\\meadows.txt");
  Path mountains = Path.of("Rooms\\mountains.txt");
  Path village = Path.of("Rooms\\village.txt");
  Path theVoid = Path.of("Rooms\\theVoid.txt");

  Path blank = Path.of("Rooms\\blank.txt");

  Path exploreForest = Path.of("Rooms\\exploreForest.txt");
  Path exploreDeepForest = Path.of("Rooms\\exploreDeepForest.txt");
  Path exploreForest2 = Path.of("Rooms\\exploreForest2.txt");
  Path exploreLake = Path.of("Rooms\\exploreLake.txt");
  Path exploreCave = Path.of("Rooms\\exploreCave.txt");
  Path exploreVillage = Path.of("Rooms\\exploreVillage.txt");
  Path exploreMeadows = Path.of("Rooms\\exploreMeadows.txt");
  Path exploreMountains = Path.of("Rooms\\exploreMountains.txt");
  Path exploreMeadows2 = Path.of("Rooms\\exploreMeadows2.txt");


  public String blank() throws IOException {
    return Files.readString(blank);
  }

  public String theVoid() throws IOException {
    //the void
    return Files.readString(theVoid);
  }

  public String forest() throws IOException {
    return Files.readString(forest);
  }

  public String deepForest() throws IOException {
    //big ass spider
    return Files.readString(deepForest);
  }

  public String cave() throws IOException {
    //white dragon
    return Files.readString(cave);
  }

  public String meadow() throws IOException {
    return Files.readString(meadows);
  }

  public String mountains() throws IOException {
    //yeti
    return Files.readString(mountains);
  }

  public String abandonedVillage() throws IOException {
    return Files.readString(village);
  }

  public String lake() throws IOException {
    //Nessie
    return Files.readString(lake);
  }

  public String exploreForest1() throws IOException {
    //boar
    return Files.readString(exploreForest);
  }

  public String exploreDeepForest() throws IOException {
    return Files.readString(exploreDeepForest);
  }

  public String exploreForest2() throws IOException {
    return Files.readString(exploreForest2);
  }

  public String exploreLake() throws IOException {
    //nessie
    return Files.readString(exploreLake);
  }

  public String exploreCave() throws IOException {
    return Files.readString(exploreCave);
  }

  public String exploreVillage() throws IOException {
    return Files.readString(exploreVillage);
  }

  public String exploreMeadows() throws IOException {
    return Files.readString(exploreMeadows);
  }

  public String exploreMountains() throws IOException {
    return Files.readString(exploreMountains);
  }

  public String exploreMeadows2() throws IOException {
    return Files.readString(exploreMeadows2);
  }
}
