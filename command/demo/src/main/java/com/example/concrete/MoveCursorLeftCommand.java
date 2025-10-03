package com.example.concrete;

import com.example.Command;
import com.example.PixelGrid;

public class MoveCursorLeftCommand implements Command {
    private final PixelGrid grid;

    public MoveCursorLeftCommand(PixelGrid grid){
        this.grid = grid;
    }

    @Override
    public void execute(){
        grid.moveLeft();
    }

}
