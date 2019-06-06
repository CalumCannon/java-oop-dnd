package Game.Weapon;

import java.util.ArrayList;
import java.util.Random;

public class Weapon implements IWeapon {

    public Weapon() {
        list = new ArrayList<WeaponEnum>();
        weapon = getWeapon();

    }


    public WeaponEnum getWeapon(){
        for(WeaponEnum weapon: WeaponEnum.values()){
            list.add(weapon);
        }
        int random = (int)(Math.random() * list.size());
        return list.get(random);

    }

    public String getName() {
        return weapon.name();
    }

    public int getValue(){
        return weapon.getValue();
    }

    public void setWeaponType(WeaponEnum weapon) {
        this.weapon = weapon;
    }
}
