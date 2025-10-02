package com.example.concrete;

import com.example.Tile;

public class WaterTile extends Tile {

    @Override
    public String getCharacter(){
        return "W";
    }

    public String getDescription(){
        return "Water";
    }

}