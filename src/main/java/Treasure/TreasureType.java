package Treasure;

public enum TreasureType {

    GOLD(50),
    GEM(75),
    ARTIFACT(100);

    private int treasureValue;

    TreasureType(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public int getTreasureValue() {
        return treasureValue;
    }
}
