package com.example;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.image.Image;

public class TileGraphicFactory {
    private Map<String, Image> cache = new HashMap<>();

    public Image getTileImage(String tileType){
        
        // Load image from resources
        if (!cache.containsKey(tileType)){
            String imagePath = "/images/" + tileType + ".png";
            Image image = new Image(getClass().getResourceAsStream(imagePath));
            cache.put(tileType, image);
        }

        return cache.get(tileType);
    }
}
