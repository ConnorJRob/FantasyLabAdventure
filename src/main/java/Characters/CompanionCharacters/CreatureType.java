package Characters.CompanionCharacters;

public enum CreatureType {

    BASILISK(6),
    DRAKE(7),
    ELEMENTAL(8);

    private int creatureAttack;

    CreatureType(int creatureAttack) {
        this.creatureAttack = creatureAttack;
    }

    public int getCreatureAttack() {
        return creatureAttack;
    }
}
