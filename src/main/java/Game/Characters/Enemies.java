package Game.Characters;

import Game.Weapon.IWeapon;
import Game.Weapon.Weapon;

import java.util.ArrayList;

public class Enemies  implements IAttack, IDamage{

    private String name;
    private int health;
    private Weapon weapon;


    public Enemies() {
        //get and e enum
        EnemyEnum enemy = selectRandomEnemyEnum();
        this.name = enemy.name();
        this.health = enemy.getValue();
        generateWeapon();
       // this.addWeapon();
    }

    public int attack() {
        return this.useWeapon();
    }

    private int useWeapon(){
        return weapon.getValue();
    }

    public void damage(int damage) {
        this.damageCharacter(damage);
    }

    private void damageCharacter(int damage){
        this.health -= damage;
    }

    private void generateWeapon(){
         weapon = new Weapon();
    }

    private EnemyEnum selectRandomEnemyEnum(){
        ArrayList<EnemyEnum> enemies = new ArrayList<EnemyEnum>();
        for(EnemyEnum enemy : EnemyEnum.values()){
            enemies.add(enemy);
        }
        int rand = (int)(Math.random()*enemies.size());
        return enemies.get(rand);
    }

    public int getHealth() {
        return this.health;
    }
}
