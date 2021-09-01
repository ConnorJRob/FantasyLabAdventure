package Characters.MeleeCharacters;

import Characters.Character;
import Weapons.Weapon;

public abstract class MeleeCharacter extends Character {

    Weapon weapon;

    public MeleeCharacter(int hitPoints, String name, Weapon weapon) {
        super(hitPoints, name);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
