package Game.Characters;

import Game.Loot.Loot;
import Game.Loot.LootEnum;
import Game.Weapon.IWeapon;
import Game.Weapon.Weapon;

import java.util.ArrayList;

public class Player extends Character implements IWeapon, IAttack, IDamage, IGood{

    private ArrayList<LootEnum> lootBag;

    public Player(String name, int health) {
        super(name, health);
        this.lootBag = new ArrayList<LootEnum>();
    }

    public void addLoot(LootEnum loot){
        this.lootBag.add(loot);
    }

    public void removeLoot(){
       int rand = (int)(Math.random() * this.lootBag.size());
       this.lootBag.remove(rand);
    }

    public int getLootCount(){
       return lootBag.size();
    }

    public int getLootValue(){
        int totalValue = 0;
        for(LootEnum loot : this.lootBag){
            totalValue += loot.getValue();
        }
        return totalValue;
    }

    public int attack() {
        return this.useWeapon();
    }

    public void damage(int damage) {
      this.damageCharacter(damage);
    }

    public void recover(int health){
        super.recover(health);
    }

    public int getValue(){
        return 0;
    }

}

