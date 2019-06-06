package Game.Weapon;

public enum WeaponEnum {

    AXE(4),
    SPEAR(5),
    DAGGER(3),
    ZARGOSSPEAROFFEAR(6);

    private int value;

    WeaponEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
