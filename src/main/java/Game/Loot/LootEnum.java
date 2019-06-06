package Game.Loot;

public enum LootEnum {
    GoldRing(10),
    SilverChalice(5),
    CrackedBronzeCrown(20),
    Emerald(12),
    Diamond(30),
    GoldenRingOfRangard(40),
    BlazgardKingOfTheBlogronitesLegendaryStaff (100);

    private int value;

    LootEnum(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
