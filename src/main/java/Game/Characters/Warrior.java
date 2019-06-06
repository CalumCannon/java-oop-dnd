package Game.Characters;

import Game.Weapon.IWeapon;
import Game.Weapon.Weapon;

public class Warrior extends Player {
    public Warrior(String name, int health) {
        super(name, health);
        generateWeapon();
    }

    public void generateWeapon(){
        Weapon weapon = new Weapon();
        super.addWeapon(weapon);
    }

}
