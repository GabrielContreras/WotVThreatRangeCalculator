package com.learning;

public class ThreatMap {
    boolean[][] threatMap;
    boolean[][] movementMap;
    int maxY;
    int maxX;
    String name;
    GameMap map;

    public ThreatMap(GameMap map) {
        this.threatMap =  new boolean[map.getMaxY()][map.getMaxX()];
        this.movementMap = new boolean[map.getMaxY()][map.getMaxX()];
        this.maxX = map.getMaxX();
        this.maxY = map.getMaxY();
        this.name = map.getName();
        this.map = map;
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
            System.out.print("| ");
            for(int x = 0; x < this.maxX; x++){
                System.out.print((threatMap[y][x] ? "X" : " ") + " | ");
            }
            System.out.print("\n");
            for(int x = 0; x < this.maxX; x++){
                System.out.print("----");
            }
            System.out.print("\n");
        }
    }

    //wrapper for checkMovementTiles()
    public void calculateThreat(Character character, int characterPositionX, int characterPositionY){
        checkMovementTiles(character, characterPositionX, characterPositionY, character.getMove());
    }

    private void checkMovementTiles(Character character, int posX, int posY, int movementDistance){
        if(movementDistance < 0){
            return;
        }
        if(!this.threatMap[posY][posX]){
            this.threatMap[posY][posX] = true;
        }

        checkTilesInRange(character, posX, posY, character.getMaxDistance(0));

        if(posX + 1 >= 0 && this.threatMap[0].length > posX + 1){
            if(isAbleToTraverse(character, posX, posY, posX+1, posY))
                checkMovementTiles(character, posX + 1, posY, movementDistance - 1);
        }
        if(posX - 1 >= 0 && this.threatMap[0].length > posX - 1){
            if(isAbleToTraverse(character, posX, posY, posX-1, posY))
                checkMovementTiles(character, posX - 1, posY, movementDistance - 1);
        }
        if (posY + 1 >= 0 && this.threatMap.length > posY + 1){
            if(isAbleToTraverse(character, posX, posY, posX, posY+1))
                checkMovementTiles(character, posX, posY + 1, movementDistance - 1);
        }
        if (posY - 1 >= 0 && this.threatMap.length > posY - 1){
            if(isAbleToTraverse(character, posX, posY, posX, posY-1))
                checkMovementTiles(character, posX, posY - 1, movementDistance - 1);
        }
    }

    private void checkTilesInRange(Character character, int initialX, int initialY, int distance){

    }

    private boolean isAbleToTraverse(Character character, int posX1, int posy1, int posX2, int posY2){
        int jump = character.getJump();
        int jumpDifference = Math.abs(this.map.getHeight(posX1,posy1) - this.map.getHeight(posX2,posY2));

        return jump >= jumpDifference;
    }
}
