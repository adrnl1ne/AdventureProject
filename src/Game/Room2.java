package Game;


import java.nio.file.Path;

public class Room2 {
  EnvironmentGenerator environmentGenerator = new EnvironmentGenerator();


  private String name;
  private int number;
  private Path description;

  //constructor
  public Room2(String name, int number, Path description) {
    this.name = name;
    this.number = number;
    this.description = description;
  }

  Room2 forest = new Room2("Forest", 1, environmentGenerator.forest);
  Room2 deepForest = new Room2("Deep Forest", 2, environmentGenerator.deepForest);
  Room2 forest2= new Room2("Forest", 3, environmentGenerator.forest);
  Room2 lake = new Room2("Lake", 4, environmentGenerator.lake);
  Room2 village = new Room2("Village",6, environmentGenerator.village);
  Room2 cave = new Room2("Cave",5, environmentGenerator.cave);
  Room2 meadows = new Room2("Meadows",7, environmentGenerator.meadows);
  Room2 mountains = new Room2("Mountains",8, environmentGenerator.mountains);
  Room2 meadows2 = new Room2("Meadows", 9, environmentGenerator.meadows);



}
