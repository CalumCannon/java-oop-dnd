package Game.Characters;
import Game.Weapon.Weapon;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int health;
    private ArrayList<Weapon> weapons;


    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    //Not finished
    public void useWeapon() {
        weapons.get(0);//.use();
    }

    public int getHealth(){
        return this.health;
    }

    public void damageCharacter(int dmg){
        this.health -= dmg;
    }

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }

}
