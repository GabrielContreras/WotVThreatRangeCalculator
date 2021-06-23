package com.learning;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Maps.getMap(0).printMap();

        ThreatMap threat = new ThreatMap(Maps.getMap(0));
        Character testChar = new Character("Gilgamesh", 4, 2, new ArrayList<>());
        threat.calculateThreat(testChar, 0, 2);

        threat.printMap();
    }
}
