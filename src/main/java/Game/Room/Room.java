package Game.Room;

import Game.Characters.Enemies;
import Game.Characters.Player;
import Game.Loot.Loot;
import Game.Loot.LootEnum;

import java.util.ArrayList;

public class Room {


    private Player player;
    private Enemies enemy;
    private Loot loot;

    public Room(Player player) {
        this.player = player;
        this.enemy = new Enemies();
        this.loot = new Loot();
        startCombat();
       // playerAttack();
    }

    public Player startCombat(){
        playerAttack();
        return player;
    }

    private void playerAttack(){
        enemy.damage(player.attack());

        if(enemy.getHealth() > 0){
            enemyAttack();
        }else{
            return;
        }
    }

    private void enemyAttack(){
        player.damage(enemy.attack());
        if(player.getHealth() > 0){
            playerAttack();
        }else{
            return;
        }
    }

    public Player getPlayer(){
        return player;
    }

    public Enemies getEnemy(){
        return enemy;
    }

    public LootEnum getLoot(){
        return loot.getRandom();
    }

    public int totalLootValue(){
        return player.getLootValue();
    }
}
