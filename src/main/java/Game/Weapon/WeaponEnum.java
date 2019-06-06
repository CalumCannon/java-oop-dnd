package Game.Weapon;

public enum WeaponEnum {

    AXE(4),
    Spear(5);

    private int value;

    WeaponEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
