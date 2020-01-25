import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    Team chargers = new Team("Chargers");
    Player todd = new Player("Todd", 70, 150);

    @Test
    public void testAddPlayer(){
        chargers.addPlayer(todd);
        assertEquals(1, chargers.getRoster().size());
    }

}