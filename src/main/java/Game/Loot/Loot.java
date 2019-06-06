package Game.Loot;

import java.util.ArrayList;
import java.util.Random;

public class Loot {

    public LootEnum getLootByIndex(int index){
        ArrayList<LootEnum> lootList = new ArrayList<LootEnum>();

        for(LootEnum loot : LootEnum.values()){
            lootList.add(loot);
        }

        return lootList.get(index);
    }

    public LootEnum getRandom(){
        ArrayList<LootEnum> lootList = new ArrayList<LootEnum>();

        for(LootEnum loot : LootEnum.values()){
            lootList.add(loot);
        }

        int returnIndex = (int)(Math.random() * lootList.size());
        return lootList.get(returnIndex);
    }

}
