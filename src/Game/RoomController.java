package Game;

public class RoomController {

  EnvironmentGenerator environmentGenerator = new EnvironmentGenerator();

  RoomGenerator forest1 = new RoomGenerator(1, environmentGenerator.forest);
  RoomGenerator deepForest = new RoomGenerator(2, environmentGenerator.deepForest);
  RoomGenerator forest2 = new RoomGenerator(3, environmentGenerator.forest);
  RoomGenerator lake = new RoomGenerator(4, environmentGenerator.lake);
  RoomGenerator village = new RoomGenerator(6, environmentGenerator.village);
  RoomGenerator cave = new RoomGenerator(5, environmentGenerator.cave);
  RoomGenerator meadows = new RoomGenerator(7, environmentGenerator.meadows);
  RoomGenerator mountains = new RoomGenerator(8, environmentGenerator.mountains);
  RoomGenerator meadows2 = new RoomGenerator(9, environmentGenerator.meadows);

  //Room1
    forest1.setNorth(null);
    forest1.setEast(deepForest);
    forest1.setSouth(lake);
    forest1.setWest(null);
  //RoomGenerator
    deepForest.setNorth(null);
    deepForest.setEast(forest2);
    deepForest.setSouth(null);
    deepForest.setWest(forest1);
  //Room3
    forest2.setNorth(null);
    forest2.setEast(null);
    forest2.setSouth(cave);
    forest2.setWest(deepForest);
  //Room4
    lake.setNorth(forest1);
    lake.setEast(null);
    lake.setSouth(meadows);
    lake.setWest(null);
  //Room5
    village.setNorth(null);
    village.setEast(null);
    village.setSouth(mountains);
    village.setWest(null);
  //Room6
    cave.setNorth(forest2);
    cave.setEast(null);
    cave.setSouth(meadows2);
    cave.setWest(null);
  //Room7
    meadows.setNorth(lake);
    meadows.setEast(mountains;
    meadows.setSouth(null);
    meadows.setWest(null);
  //Room8
    mountains.setNorth(village);
    mountains.setEast(meadows2);
    mountains.setSouth(null);
    mountains.setWest(meadows);
  //Room9
    meadows2.setNorth(cave);
    meadows2.setEast(null);
    meadows2.setSouth(null);
    meadows2.setWest(mountains);


}
