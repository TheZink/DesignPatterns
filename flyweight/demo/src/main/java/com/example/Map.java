package com.example;


public abstract class Map extends Game {

    protected String[][] terrainTile;

    public abstract void createTile();

    public void display(){

        for (int i = 0; i < terrainTile.length; i++){

            // Convert output to the String, otherwise it will print reference from memory
            System.out.println(String.join(" ", terrainTile[i]));
        }
    };

}
