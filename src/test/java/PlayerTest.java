import Game.Characters.Player;
import Game.Loot.Loot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;
    private Loot loot;

    @Before
    public void setUp(){
        player = new Player("Calum", 100);
        loot = new Loot();
    }

    @Test
    public void testCanAddToLootBag() {
        player.addLoot(loot.getRandom());
        assertEquals(1 , player.getLootCount());
    }

    @Test
    public void testLootValue() {
        player.addLoot(loot.getLootByIndex(0));
        player.addLoot(loot.getLootByIndex(0));
        player.addLoot(loot.getLootByIndex(0));

        assertEquals(30, player.getLootValue());
    }

    @Test
    public void removeLoot() {
        player.addLoot(loot.getLootByIndex(0));
        player.addLoot(loot.getLootByIndex(0));
        player.removeLoot();

        assertEquals(1, player.getLootCount());
    }
}
