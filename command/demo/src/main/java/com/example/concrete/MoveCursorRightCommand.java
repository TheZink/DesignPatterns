package com.example.concrete;

import com.example.Command;
import com.example.PixelGrid;

public class MoveCursorRightCommand implements Command{
    private final PixelGrid grid;

    public MoveCursorRightCommand(PixelGrid grid){
        this.grid = grid;
    }

    @Override
    public void execute(){
        grid.moveRight();
    }

}
