import Game.Characters.Player;
import Game.Characters.Warrior;
import Game.Game;
import Game.Room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Player player;
    private Room room;
    private Game game;


    @Before

    public void setUp() {
        player = new Warrior("Calum", 110);
        room = new Room(player);
        game = new Game();
    }

    @Test
    public void canCreateRoom() {
        assert(room.getPlayer() != null);
    }

    @Test
    public void canGetEnemy() {
        assert(room.getEnemy() != null);
    }

    @Test
    public void canGetLoot() {
        assert(room.getLoot() != null);
    }

    @Test
    public void canDoCombat(){
        player = room.startCombat();
        assert(player.getHealth() < 110);
        assert(room.getEnemy().getHealth() < 30);
    }

    @Test
    public void canWin() {
        Room room = new Room(player);
        assertEquals(100, player.getLootValue());
    }
}
