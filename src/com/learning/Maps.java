package com.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Maps{
    private final static Map<Integer, GameMap> maps = new HashMap<>();

    //Static block to initialize GameMap objects from maps.csv file
    static {
        try(BufferedReader scanner = new BufferedReader(new FileReader("src/inputs/maps.csv"))){
            String inputLine;
            int index = 0;
            while((inputLine = scanner.readLine()) != null){
                String[] data = inputLine.split(",");
                int x = Integer.parseInt(data[1]), y = Integer.parseInt(data[2]);
                int[][] tempBoard = new int[y][x];

                //Populate board 2D array with tile heights
                int current = 3;
                for(int i = 0; i < y; i++){
                    for(int j = 0; j < x; j++){
                        tempBoard[i][j] = Integer.parseInt(data[current++]);
                    }
                }
                maps.put(index++,new GameMap(data[0],Integer.parseInt(data[1]),Integer.parseInt(data[2]),tempBoard));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static GameMap getMap(int number){
        return maps.get(number);
    }

}
