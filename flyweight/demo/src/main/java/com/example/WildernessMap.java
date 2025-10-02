package com.example;


import java.util.Random;

import com.example.concrete.ForestTile;
import com.example.concrete.SwampTile;
import com.example.concrete.WaterTile;

public class WildernessMap extends Map {
    
    @Override
    public void createTile(){

        ForestTile forest = new ForestTile();
        SwampTile swamp = new SwampTile();
        WaterTile water = new WaterTile(); 
        Random random = new Random();

        String[] terrainType = {
            forest.getCharacter(),
            swamp.getCharacter(),
            water.getCharacter()   
        };

        terrainTile = new String[10][10];

 
        // Loop for row
        for (int i = 0; i < terrainTile.length; i++) {

            // Loop for columns
            for (int j = 0; j < terrainTile[i].length; j++){
                
                int rnd = random.nextInt(3); // Randomize number between 0 and 2
                terrainTile[i][j] = terrainType[rnd]; // Add selected terrain to the game
            }
        }
    }
}
