package com.learning;

import java.util.ArrayList;

public class Character {
    private String name;
    private int move;
    private int jump;
    ArrayList<Job> jobList;

    public Character(String name, int move, int jump, ArrayList<Job> jobList) {
        this.name = name;
        this.move = move;
        this.jump = jump;
        this.jobList = jobList;
    }
}
