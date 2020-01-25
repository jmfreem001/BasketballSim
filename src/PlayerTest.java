import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
//    @org.junit.jupiter.api.BeforeEach
//    void setUp() {
//
//    }
    Player player = new Player("Paul", 74, 180);
    @Test
    public void testReadableHeight(){

        assertEquals("6'2\"", player.getReadableHeight() );
        //should be 6'2"
    }



//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//    }
}