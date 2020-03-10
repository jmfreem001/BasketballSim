package com.freemanj;

import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> roster = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player addedPlayer){
        this.roster.add(addedPlayer);
    }

    public ArrayList<Player> getRoster() {
        return roster;
    }

    public void printRoster(){
        System.out.println(name + ": ");
        for (Player player : roster){
            System.out.println(player);
        }
    }

    public String getName() {
        return name;
    }
}
