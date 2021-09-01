package Characters.MagicCharacters;

public enum MagicType {

    FIRE(10),
    NECROMANCY(9),
    ICE(8);

    private final int spellDamage;

    MagicType(int spellDamage){
        this.spellDamage = spellDamage;
    }

    public int getSpellDamage() {
        return spellDamage;
    }
}
