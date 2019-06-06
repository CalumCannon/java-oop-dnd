import Game.Weapon.Weapon;
import Game.Weapon.WeaponEnum;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class WeaponTest {

    private Weapon weapon;

    @Before

    public void setUp() {
        weapon = new Weapon();
    }

    @Test
    public void hasName() {
        weapon.setWeaponType(WeaponEnum.AXE);
        assertEquals(4, weapon.getValue());
        assertEquals("AXE", weapon.getName());
    }

}
