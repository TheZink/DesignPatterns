package src.concrete;

import src.Tile;

public class BuildingTile extends Tile {

    @Override
    public String getCharacter(){
        return "B";
    }

    public String getDescription(){
        return "Building";
    }

}
