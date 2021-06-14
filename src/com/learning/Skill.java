package com.learning;

public class Skill {
    private final String name;
    private final int range;
    private final int rangeHeight;
    private final boolean isAoe;
    private final int aoeHeight;
    private final int aoeRange;


    public Skill(String name, int range, int rangeHeight) {
        this(name, rangeHeight, range, false, 0, 0);
    }

    public boolean isAoe() {
        return isAoe;
    }

    public Skill(String name, int range, int rangeHeight, boolean isAoe, int aoeRange, int aoeHeight) {
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
