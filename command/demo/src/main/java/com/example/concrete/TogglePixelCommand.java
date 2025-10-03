package com.example.concrete;

import com.example.Command;
import com.example.PixelGrid;

public class TogglePixelCommand implements Command{
    private final PixelGrid grid;

    public TogglePixelCommand(PixelGrid grid){
        this.grid = grid;
    }

    public void execute(){
        grid.togglePixel();
    }

}
