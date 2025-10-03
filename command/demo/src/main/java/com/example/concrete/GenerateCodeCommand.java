package com.example.concrete;

import com.example.Command;
import com.example.PixelGrid;

public class GenerateCodeCommand implements Command {
    private final PixelGrid grid;

    public GenerateCodeCommand(PixelGrid grid){
        this.grid = grid;
    }

    @Override
    public void execute(){
        int[][] data = grid.getGrid();

        System.out.println("int[][] pixerArt = {");

        for (int row = 0; row < data.length; row++){
            System.out.print("{");
            for (int col = 0; col <data[row].length; col++){
                System.out.print(data[row][col]);

                if (col < data[row].length - 1) System.out.print(", ");
            }
            
            if (row < data.length - 1) System.out.println("},");
            else {System.out.println("}");}
        }

        System.out.println("};");
    }

}
