import Game.Characters.Wizard;
import org.junit.Before;
import org.junit.Test;

public class WizardTest {

    private Wizard wizard;

    @Before

    public void setUp() {
        wizard = new Wizard("John", 100);
    }

    @Test
    public void canGetSpell() {
        assert( wizard.countWeapons() > 0);
    }
}
