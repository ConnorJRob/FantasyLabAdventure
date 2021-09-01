package Characters.EnemyCharacters;

import Attacks.MeleeAttack;
import Attacks.SpellAttack;
import Characters.Character;

public class Dragon extends Enemy implements MeleeAttack, SpellAttack {

    private int slash = 25;
    private int fireBreath = 35;

    public Dragon(int hitPoints, String name) {
        super(hitPoints, name);
    }

    public void meleeAttack(Character character) {
        character.takeDamage(slash);
    }

    public void castSpellAttack(Character character) {
        character.takeDamage(fireBreath);
    }
}
