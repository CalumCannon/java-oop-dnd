package Game;

import Game.Characters.Player;
import Game.Characters.Wizard;
import Game.Loot.Loot;
import Game.Loot.LootEnum;
import Game.Room.Room;

public class Game {

    Player player;

    void createPlayer(){

        player = new Wizard("Calum",100 );
    }

    public void startQuest(){
        Room room = new Room(player);
        player = room.startCombat();

        if(player.getHealth() > 0){
            //add loot
            player.addLoot(room.getLoot());

            if(player.getLootValue() > 100){
                System.out.println("YOU WIN");
            }else{
                //NEXT ROOM
                startQuest();
            }
        }else {
            System.out.println("You Dead");
        }
    }

}
