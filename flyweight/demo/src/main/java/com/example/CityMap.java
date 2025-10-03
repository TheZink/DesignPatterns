package com.example;

import java.util.Random;

import com.example.concrete.BuildingTile;
import com.example.concrete.ForestTile;
import com.example.concrete.RoadTile;

public class CityMap extends Map {

    @Override
    public void createTile(){

        BuildingTile building = new BuildingTile();
        RoadTile road = new RoadTile();
        ForestTile forest = new ForestTile();
        Random random = new Random();

        String[] terrainType = {
            building.getDescription(),
            road.getDescription(),
            forest.getDescription()   
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
