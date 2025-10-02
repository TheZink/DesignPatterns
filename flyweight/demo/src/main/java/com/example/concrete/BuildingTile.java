package com.example.concrete;

import com.example.Tile;

public class BuildingTile extends Tile {

    @Override
    public String getCharacter(){
        return "B";
    }

    public String getDescription(){
        return "Building";
    }

}
