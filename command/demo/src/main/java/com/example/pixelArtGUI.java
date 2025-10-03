package com.example;

import com.example.concrete.GenerateCodeCommand;
import com.example.concrete.MoveCursorDownCommand;
import com.example.concrete.MoveCursorLeftCommand;
import com.example.concrete.MoveCursorRightCommand;
import com.example.concrete.MoveCursorUpCommand;
import com.example.concrete.TogglePixelCommand;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class pixelArtGUI extends Application {
    private static int gridSize = 8;
    private static int cellSize = 50;
    private PixelGrid pixelGrid = new PixelGrid();
    private Rectangle[][] cells = new Rectangle[gridSize][gridSize];

    public void start(Stage primaryStage){
        primaryStage.setTitle("PixelArt");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
              
        // Generate rectangle to the scene
        for (int row = 0; row < gridSize; row++){
            for (int col = 0; col < gridSize; col++){
                Rectangle rectangle = new Rectangle(cellSize, cellSize);
                rectangle.setStroke(Color.GRAY);
                rectangle.setFill(Color.WHITESMOKE);
                cells[row][col] = rectangle;
                grid.add(rectangle, col, row);
            }
        }

        // -- Not displayed during program execution due to a bug --
        // Button button = new Button("Generate art to the console");
        // button.setAlignment(Pos.CENTER);

        // button.setOnAction(e -> {
        //     Command generate = new GenerateCodeCommand(pixelGrid);
        //     generate.execute();
        // });
        // -- Not displayed during program execution due to a bug --
        
        Label label = new Label("Use your arrow key, to move in the grid. Press ENTER to generate art to the console.");

        VBox layout = new VBox(10,label, grid);
        Scene scene = new Scene(layout, 500, 450);

        // Keyboard handler
        scene.setOnKeyPressed(event -> {
            Command command = null;
            if (event.getCode() == KeyCode.UP) { command = new MoveCursorUpCommand(pixelGrid); System.out.println("Key UP pressed"); }
            if (event.getCode() == KeyCode.DOWN) { command = new MoveCursorDownCommand(pixelGrid); System.out.println("Key DOWN pressed"); }
            if (event.getCode() == KeyCode.LEFT) { command = new MoveCursorLeftCommand(pixelGrid); System.out.println("Key LEFT pressed"); }
            if (event.getCode() == KeyCode.RIGHT) { command = new MoveCursorRightCommand(pixelGrid); System.out.println("Key RIGHT pressed"); }
            if (event.getCode() == KeyCode.SPACE) { command = new TogglePixelCommand(pixelGrid); System.out.println("Key SPACE pressed"); }
            if (event.getCode() == KeyCode.ENTER) { command = new GenerateCodeCommand(pixelGrid); System.out.println("Key ENTER pressed");}

            if (command != null) {
                command.execute();
                updateGUI();
            }
        });
        
        primaryStage.setScene(scene);
        primaryStage.show();
        updateGUI();
    }

    public void updateGUI(){
        int[][] gridData = pixelGrid.getGrid();
        int cursorRow = pixelGrid.getCursorRow();
        int cursorCol = pixelGrid.getCursorCol();

        for (int row = 0; row < gridData.length; row++){
            for (int col = 0; col < gridData.length; col++){
                
                // This checks if the pixel at the current row and column is "on" (value 1).
                if (gridData[row][col] == 1){
                    cells[row][col].setFill(Color.GREEN);
                } else {
                    cells[row][col].setFill(Color.WHITE);
                }

                // This checks if the current cell is at the cursor's position.
                if (row == cursorRow && col == cursorCol){
                    cells[row][col].setStroke(Color.RED);
                    cells[row][col].setStrokeWidth(1);
                } else {
                    cells[row][col].setStroke(Color.GRAY);
                    cells[row][col].setStrokeWidth(1);
                }
            }
        }
    }
}
