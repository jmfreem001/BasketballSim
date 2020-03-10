package com.freemanj;

public class Player {
    private String name;
    private int heightInInches;
    private int weightInPounds;
    private int shootingSkill;
    private int defenseSkill;

    private int reboundSkill;
    private int Athleticism;

    public Player(String name, int heightInInches, int weightInPounds) {
        this.name = name;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    public String getReadableHeight() {
        int feet = heightInInches / 12;
        int inches = heightInInches % 12;
        return feet + "'" + inches + "\"";
    }

    @Override
    public String toString() {
        return name +
                ", " + this.getReadableHeight() +
                " " + weightInPounds +
                " pounds";
    }
}
