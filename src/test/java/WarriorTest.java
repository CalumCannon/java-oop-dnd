import Game.Characters.Warrior;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    private Warrior warrior;

    @Before

    public void setUp() {
        warrior = new Warrior("Calum", 150);
    }

    @Test
    public void canGetWaepon() {
        assertEquals(1, warrior.countWeapons());
    }

    @Test
    public void canGetWeaponDamage() {
        assert( warrior.useWeapon() > 0);
    }
}
