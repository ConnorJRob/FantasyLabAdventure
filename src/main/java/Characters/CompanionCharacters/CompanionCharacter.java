package Characters.CompanionCharacters;

import Characters.Character;

public class CompanionCharacter extends Character {

    private CreatureType creatureType;

    public CompanionCharacter(int hitPoints, String name, CreatureType creatureType) {
        super(hitPoints, name);
        this.creatureType = creatureType;
    }

    public CreatureType getCreatureType() {
        return creatureType;
    }

    public void changeCreatureType(CreatureType creatureType) {
        this.creatureType = creatureType;
    }
}
