package com.example;

public class PixelGrid {
    private final int[][] grid = new int[8][8];
    private int cursorRow = 0;
    private int cursorCol = 0;

    public int[][] getGrid(){
        return grid;
    }

    public int getCursorRow(){
        return cursorRow;
    }

       public int getCursorCol(){
        return cursorCol;
    }

    public void moveUp(){
        if (cursorRow > 0) {cursorRow--;}
    }

    public void moveDown(){
        if (cursorRow < 7) {cursorRow++;}
    }

    public void moveLeft(){
        if (cursorCol > 0) {cursorCol--;}
    }

    public void moveRight(){
        if (cursorCol < 7) {cursorCol++;}
    }

    public void togglePixel(){
        grid[cursorRow][cursorCol] = grid[cursorRow][cursorCol] == 0 ? 1 : 0;
    }
}
