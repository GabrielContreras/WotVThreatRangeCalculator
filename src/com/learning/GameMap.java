package com.learning;

import java.util.ArrayList;

public class GameMap {
    private int maxX;
    private int maxY;
    private ArrayList<ArrayList<Integer>> board;

    public GameMap(int maxX, int maxY, ArrayList<ArrayList<Integer>> board){
        this.maxX = maxX;
        this.maxY = maxY;
        this.board = board;
    }

    public int getHeight(int x, int y){
        return board.get(x).get(y);
    }
}
