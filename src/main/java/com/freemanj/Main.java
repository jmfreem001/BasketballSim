package com.freemanj;

import com.freemanj.Player;
import com.freemanj.Team;

public class Main {
    public static void main(String[] args) {
        Team lightning = new Team("Blue Lightning");
        Player bob = new Player("Bob",70, 120);
        lightning.addPlayer(bob);
        Player steve = new Player("Steve",75, 215);
        lightning.addPlayer(steve);

        Team riders = new Team("Rough Riders");
        Player paul = new Player("Paul", 76, 180);
        riders.addPlayer(paul);

        Player gary = new Player("Gary", 68, 130);
        riders.addPlayer(gary);


        lightning.printRoster();
        System.out.println(); // Add a blank line
        riders.printRoster();
    }
}
