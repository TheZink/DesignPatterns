package com.example.concrete;

import com.example.Command;
import com.example.PixelGrid;

public class MoveCursorUpCommand implements Command{ 
    private final PixelGrid grid;

    public MoveCursorUpCommand(PixelGrid grid){
        this.grid = grid;
    }

    public void execute(){
        grid.moveUp();
    }
}
