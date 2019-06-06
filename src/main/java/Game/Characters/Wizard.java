package Game.Characters;

import Game.Weapon.Spell;
import Game.Weapon.Weapon;

public class Wizard extends Player {
    public Wizard(String name, int health) {
        super(name, health);
        generateWeapon();
    }

    public void generateWeapon(){
        Spell spell = new Spell();
        super.addWeapon(spell);
    }
}
