import Characters.EnemyCharacters.Hydra;
import Characters.MeleeCharacters.Dwarf;
import Weapons.Weapon;
import Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeleeCharacterTest {

    Dwarf dwarf;
    Weapon weapon;
    Hydra hydra;

    @Before
    public void before(){
        hydra = new Hydra(140, "Onyx Hydra");
        weapon = new Weapon("Mithril Axe", WeaponType.AXE);
        dwarf = new Dwarf(100, "Rimblot", weapon);
    }

    @Test
    public void adventurerHasWeapon(){
        assertEquals(weapon, dwarf.getWeapon());
    }

    @Test
    public void adventurerMeleeAttackDamagesEnemy(){
        dwarf.meleeAttack(hydra);
        assertEquals(134, hydra.getHitPoints());
    }


}