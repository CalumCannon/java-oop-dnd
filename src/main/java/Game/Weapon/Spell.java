package Game.Weapon;

import java.util.ArrayList;

public class Spell {

    SpellEnum spell;
    ArrayList<SpellEnum> list;

    public Spell() {
        list = new ArrayList<SpellEnum>();
        spell = getSpell();

    }

    private SpellEnum getSpell() {
        for(SpellEnum spell: SpellEnum.values()){
            list.add(spell);
        }
        int random = (int)(Math.random() * list.size());
        return list.get(random);
    }

    public String getName() {
        return spell.name();
    }

    public int getValue(){
        return spell.getValue();
    }

    public void setSpellType(SpellEnum spell) {
        this.spell = spell;
    }
}
