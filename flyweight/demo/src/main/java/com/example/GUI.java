package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.image.Image;

public class GUI extends Application{

    public void start(Stage primaryStage){
        
        
        Map map = new CityMap();
        // Map map = new WildernessMap();

        map.createTile();

        TileGraphicFactory tileGraphic = new TileGraphicFactory();
        
        primaryStage.setTitle("Adventure game");

        int rows = map.terrainTile.length;
        int column = map.terrainTile[0].length;
        int tileSize = 70;

        Canvas canvas = new Canvas(rows * tileSize, column * tileSize);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        for (int y = 0; y < rows; y++){
            
            for(int x = 0; x < rows; x++){
                String tileType = map.terrainTile[y][x];
                Image image = tileGraphic.getTileImage(tileType);
                gc.drawImage(image, y * tileSize, x * tileSize);
            }
        }

        StackPane pane = new StackPane(canvas);
        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
