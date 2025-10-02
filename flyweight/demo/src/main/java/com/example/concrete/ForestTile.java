package com.example.concrete;

import com.example.Tile;

public class ForestTile extends Tile {

    @Override
    public String getCharacter(){
        return "F";
    }

    public String getDescription(){
        return "Forest";
    }

}
