package Characters.EnemyCharacters;

import Attacks.MeleeAttack;
import Characters.Character;

public class Hydra extends Enemy implements MeleeAttack {

    private int devour = 45;

    public Hydra(int hitPoints, String name) {
        super(hitPoints, name);
    }

    public void meleeAttack(Character character) {
        character.takeDamage(devour);
    }
}
