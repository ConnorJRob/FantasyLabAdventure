import Characters.CompanionCharacters.CompanionCharacter;
import Characters.CompanionCharacters.CreatureType;
import Characters.EnemyCharacters.Dragon;
import Characters.MagicCharacters.MagicType;
import Characters.MagicCharacters.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicCharacterTest {

    Warlock warlock;
    Dragon dragon;
    CompanionCharacter companionCharacter;

    @Before
    public void before(){
        companionCharacter = new CompanionCharacter(60, "Berty", CreatureType.ELEMENTAL);
        warlock = new Warlock(80, "Fjord", companionCharacter, MagicType.NECROMANCY);
        dragon = new Dragon(200, "Thordak");
    }

    @Test
    public void spellDamagesEnemy(){
        warlock.castSpellAttack(dragon);
        assertEquals(191, dragon.getHitPoints());
    }
}
