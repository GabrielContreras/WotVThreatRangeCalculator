package com.learning;

public class ThreatMap {
    boolean[][] threatMap;
    int maxY;
    int maxX;
    String name;

    public ThreatMap(GameMap map) {
        this.threatMap =  new boolean[map.getMaxY()][map.getMaxX()];
        this.maxX = map.getMaxX();
        this.maxY = map.getMaxY();
        this.name = map.getName();
    }

    public boolean isInThreatRange(int x, int y){
        return this.threatMap[y][x];
    }

    public void setThreatMapTile(int x, int y){
        threatMap[y][x] = true;
    }

    public void printMap(){
        System.out.println("Map: " + this.name);
        for(int y = 0; y < this.maxY; y++){
            for(int x = 0; x < this.maxX; x++){
                System.out.print(threatMap[y][x] + " ");
            }
            System.out.print("\n");
        }
    }
}
