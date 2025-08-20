package src.concrete;

import src.Tile;

public class WaterTile extends Tile {

    @Override
    public String getCharacter(){
        return "W";
    }

    public String getDescription(){
        return "Water";
    }

}