package Game.Weapon;

public enum SpellEnum {

    HEAL(2),
    DAMAGE(3);

    private int value;

    SpellEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
