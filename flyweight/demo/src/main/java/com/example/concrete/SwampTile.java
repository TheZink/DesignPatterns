package com.example.concrete;

import com.example.Tile;

public class SwampTile extends Tile {

    @Override
    public String getCharacter(){
        return "S";
    }

    public String getDescription(){
        return "Swamp";
    }

}
