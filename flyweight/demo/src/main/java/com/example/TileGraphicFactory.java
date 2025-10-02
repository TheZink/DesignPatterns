package com.example;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;

public class TileGraphicFactory {
    private Map<Tile, Image> cache = new HashMap<>();

    public void addTile(Tile tileType, Image tileImage){
        cache.put(tileType, tileImage);
    }

    public Image getTileImage(String tileType){
        if (!cache.containsKey(tileType)){
            
        }
        return null;

    }
}
