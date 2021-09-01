package Characters.EnemyCharacters;

import Attacks.SpellAttack;
import Characters.Character;

public class Beholder extends Enemy implements SpellAttack{

    private int beholderDeathRay = 30;

    public Beholder(int hitPoints, String name) {
        super(hitPoints, name);
    }

    public void castSpellAttack(Character character) {
        character.takeDamage(beholderDeathRay);
    }
}
