package com.learning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;

public class Character {
    private String name;
    private int move;
    private int jump;
    ArrayList<Skill> skills;
//    Job mainJob;
//    ArrayList<Job> subJobList;

    public Character(String name, int move, int jump, ArrayList<Skill> skills) {
        this.name = name;
        this.move = move;
        this.jump = jump;

        //Populate skills ArrayList
        try(BufferedReader reader = new BufferedReader(new FileReader("src/inputs/skills/" + name.toLowerCase() + "_skills.csv"))){
            String input;
            while ((input = reader.readLine()) != null){
                String[] data = input.split(",");
                String skillName = data[0];
                int skillRange = Integer.parseInt(data[1]);
                int skillRangeHeight = Integer.parseInt(data[2]);
                boolean isAoe = Boolean.parseBoolean(data[3]);
                if(isAoe){
                    int aoeRange = Integer.parseInt(data[4]);
                    int aoeHeight = Integer.parseInt(data[5]);
                    skills.add(new Skill(skillName,skillRange,skillRangeHeight,isAoe,aoeRange,aoeHeight));
                } else {
                    skills.add(new Skill(skillName,skillRange,skillRangeHeight));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public int getMove() {
        return move;
    }

    public int getJump() {
        return jump;
    }

    public int getMaxDistance(int height){
        if(skills == null){
            return 0;
        }
        int maxDistance = 0;
        for(Skill skill: this.skills){
            if(skill.getRangeHeight() >= height){
                if(maxDistance < skill.getRange()){
                    maxDistance = skill.getRange();
                }
            }
        }
        return maxDistance;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }
}
