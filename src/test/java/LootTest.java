import Game.Loot.Loot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LootTest {

    Loot loot;

    @Before
    public void setUp() {
        loot = new Loot();

    }

    @Test
    public void testGetFirstLootItem() {
      assertEquals("GoldRing",loot.getLootByIndex(0).toString());
    }

    @Test
    public void testGetValue() {
        assertEquals(10,loot.getLootByIndex(0).getValue());
    }

    @Test
    public void testGetRandomReturnsValue() {
        assertEquals(1,loot.getLootByIndex(0).toString());
    }
}
