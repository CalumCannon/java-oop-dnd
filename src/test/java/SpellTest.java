import Game.Weapon.Spell;
import Game.Weapon.SpellEnum;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpellTest {

    private Spell spell;

    @Before

    public void setUp() {
        spell = new Spell();
    }

    @Test
    public void hasProperties() {
        spell.setSpellType(SpellEnum.HEAL);
        assertEquals("HEAL", spell.getName());
        assertEquals(2, spell.getValue());

    }
}
