package com.freemanj;

import com.freemanj.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;
    @BeforeEach
    void setUp() {
        player = new Player("Paul", 74, 180);
    }

    @Test
    void getReadableHeight() {
        assertEquals("6'2\"", player.getReadableHeight(), "Wrong readable height.");
    }
}