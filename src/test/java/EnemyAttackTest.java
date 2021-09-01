import Characters.EnemyCharacters.Beholder;
import Characters.EnemyCharacters.Dragon;
import Characters.EnemyCharacters.Hydra;
import Characters.SupportCharacters.Cleric;
import HealingTools.HealingTool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyAttackTest {

    Hydra hydra;
    Dragon dragon;
    Beholder beholder;
    Cleric cleric;

    @Before
    public void before(){
        hydra = new Hydra(130,"Kyraxian");
        dragon = new Dragon(220, "Smaug");
        beholder = new Beholder(175,"Xanathar");
        cleric = new Cleric(75, "Don Juan", HealingTool.HEALINGWORD);
    }

    @Test
    public void hydraCanDamageCharacter(){
        hydra.meleeAttack(cleric);
        assertEquals(30, cleric.getHitPoints());
    }

    @Test
    public void dragonCanDamageCharacter(){
        dragon.meleeAttack(cleric);
        dragon.castSpellAttack(cleric);
        assertEquals(15, cleric.getHitPoints());
    }

    @Test
    public void beholderCanDamageCharacter(){
        beholder.castSpellAttack(cleric);
        assertEquals(45, cleric.getHitPoints());
    }

}
