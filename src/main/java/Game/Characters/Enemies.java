package Game.Characters;

import Game.Weapon.Weapon;

public class Enemies extends Character implements IAttack, IDamage{
    public Enemies(String name, int health) {
        super(name, health);
        generateWeapon();
       // this.addWeapon();
    }

    public int attack() {
        return this.useWeapon();
    }

    public void damage(int damage) {
        this.damageCharacter(damage);
    }

    public void generateWeapon(){
        Weapon weapon = new Weapon();
        super.addWeapon(weapon);
    }

}
