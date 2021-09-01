package Characters.MeleeCharacters;

import Attacks.MeleeAttack;
import Characters.Character;
import Weapons.Weapon;

public abstract class MeleeCharacter extends Character implements MeleeAttack {

    Weapon weapon;
    int damage;

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

    public void meleeAttack(Character character){
        damage = weapon.getWeaponType().getDamageAmount();
        character.takeDamage(damage);
    }
}
