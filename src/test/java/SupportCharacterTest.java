import Characters.MeleeCharacters.Dwarf;
import Characters.SupportCharacters.Cleric;
import HealingTools.HealingTool;
import Weapons.Weapon;
import Weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SupportCharacterTest {

    Cleric cleric;
    Dwarf dwarf;
    Weapon weapon;

    @Before
    public void before(){
        cleric = new Cleric(70, "Cardinal Harper", HealingTool.CUREWOUNDS);
        weapon = new Weapon("Mithril Axe", WeaponType.AXE);
        dwarf = new Dwarf(100, "John son of Thráin", weapon);
    }

    @Test
    public void clericCanHealOtherCharacters(){
        dwarf.takeDamage(25);
        assertEquals(75, dwarf.getHitPoints());
        cleric.healAbility(dwarf);
        assertEquals(80, dwarf.getHitPoints());
    }

}
