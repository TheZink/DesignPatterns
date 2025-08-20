package src.concrete;

import src.Tile;

public class ForestTile extends Tile {

    @Override
    public String getCharacter(){
        return "F";
    }

    public String getDescription(){
        return "Forest";
    }

}
