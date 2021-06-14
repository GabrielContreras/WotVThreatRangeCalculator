package com.learning;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps{
    private Map<Integer, GameMap> maps;

    static {
        try(BufferedReader scanner = new BufferedReader(new FileReader("inputs\\maps.csv"))){
            String inputLine;
            while((inputLine = scanner.readLine()) != null){
                String[] data = inputLine.split(",");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public Maps(){
        this.maps = new HashMap<>();
    }

    public GameMap getMap(int number){
        return maps.get(number);
    }

}
