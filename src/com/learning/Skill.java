package com.learning;

public class Skill {
    private String name;
    private int rangeHeight;
    private int range;
    private boolean isAoe;
    private int aoeHeight;
    private int aoeRange;


    public Skill(String name, int rangeHeight, int range) {
        this(name, rangeHeight, range, false, 0, 0);
    }

    public Skill(String name, int rangeHeight, int range, boolean isAoe, int aoeHeight, int aoeRange) {
        this.name = name;
        this.rangeHeight = rangeHeight;
        this.range = range;
        this.isAoe = isAoe;
        this.aoeHeight = aoeHeight;
        this.aoeRange = aoeRange;
    }

    public int getAoeHeight() {
        return aoeHeight;
    }

    public int getAoeRange() {
        return aoeRange;
    }

    public String getName() {
        return name;
    }

    public int getRangeHeight() {
        return rangeHeight;
    }

    public int getRange() {
        return range;
    }
}
