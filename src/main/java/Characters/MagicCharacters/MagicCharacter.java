package Characters.MagicCharacters;

import Attacks.SpellAttack;
import Characters.Character;
import Characters.CompanionCharacters.CompanionCharacter;

public abstract class MagicCharacter extends Character implements SpellAttack {

    private CompanionCharacter companionCharacter;
    private MagicType magicType;

    public MagicCharacter(int hitPoints, String name, CompanionCharacter companionCharacter, MagicType magicType) {
        super(hitPoints, name);
        this.companionCharacter = companionCharacter;
        this.magicType = magicType;
    }

    public CompanionCharacter getCompanionCharacter() {
        return companionCharacter;
    }

    public void changeCompanionCharacter(CompanionCharacter companionCharacter) {
        this.companionCharacter = companionCharacter;
    }

    public MagicType getMagicType() {
        return magicType;
    }

    public void changeMagicType(MagicType magicType) {
        this.magicType = magicType;
    }

    public void castSpellAttack(Character character){
        int damage = getMagicType().getSpellDamage();
        character.takeDamage(damage);
    }
}
