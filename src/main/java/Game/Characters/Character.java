package Game.Characters;
import Game.Weapon.IWeapon;
import Game.Weapon.Weapon;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int health;
    private ArrayList<IWeapon> weapons;

    public Character(String name, int health){
        this.name = name;
        this.health = health;
        this.weapons = new ArrayList<IWeapon>();
    }

    public String getName(){
        return this.name;
    }


    public int useWeapon() {
        IWeapon weapon = weapons.get(0);
        return weapon.getValue();
    }

    public int getHealth(){
        return this.health;
    }

    public void recover(int health){
        this.health += health;
    }

    public void damageCharacter(int dmg){
        this.health -= dmg;
    }

    public void addWeapon(IWeapon weapon){
        this.weapons.add(weapon);
    }

    public int countWeapons(){
        return weapons.size();
    }
}
