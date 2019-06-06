package Game.Characters;

public enum EnemyEnum {
    Ogre(30),
    Golm(30),
    Orc(30),
    Goblin(30);

    private int value;

    EnemyEnum(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
