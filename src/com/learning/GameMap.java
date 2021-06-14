package com.learning;

import java.util.ArrayList;

public class GameMap {
    private final String name;
    private final int maxX;
    private final int maxY;
    private final int[][] board;

    public GameMap(String name, int maxX, int maxY, int[][] board){
        this.name = name;
        this.maxX = maxX;
        this.maxY = maxY;
        this.board = board;
    }

    public int getHeight(int x, int y){
        return board[y][x];
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void printMap(){
        System.out.println("Map: " + this.name);
        for(int y = 0; y < this.maxY; y++){
            for(int x = 0; x < this.maxX; x++){
                System.out.print(board[y][x] + " ");
            }
            System.out.print("\n");
        }
    }
}
