import java.util.Random;

public class WildernessMap extends Map {

    @Override
    public void createTile(){
        String[] terrainType = {"S", "F", "W"};
        terrainTile = new String[10][10];

        // Loop for row
        for (int i = 0; i < terrainTile.length; i++) {

            // Loop for columns
            for (int j = 0; j < terrainTile[i].length; j++){

                int rnd = new Random().nextInt(terrainType.length);  // Select random element from terrainType
                terrainTile[i][j] = terrainType[rnd]; // Add selected terrainType to the terrainTile
            }
        }
    }
}
