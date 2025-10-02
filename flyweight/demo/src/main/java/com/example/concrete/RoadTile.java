package com.example.concrete;

import com.example.Tile;

public class RoadTile extends Tile {

    @Override
    public String getCharacter(){
        return "R";
    }

    public String getDescription(){
        return "Road";
    }

}
