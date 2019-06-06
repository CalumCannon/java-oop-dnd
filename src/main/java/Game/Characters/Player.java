package Game.Characters;
import Game.Loot.Loot;
import Game.Loot.LootEnum;
import Game.Weapon.Weapon;

import java.util.ArrayList;

public class Player extends Character {

    private ArrayList<LootEnum> lootBag;

    public Player(String name, int health) {
        super(name, health);
        this.lootBag = new ArrayList<LootEnum>();
    }

    public void addLoot(LootEnum loot){
        this.lootBag.add(loot);
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

}
