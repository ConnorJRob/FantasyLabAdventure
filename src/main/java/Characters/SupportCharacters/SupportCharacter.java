package Characters.SupportCharacters;

import Attacks.Heal;
import Characters.Character;
import HealingTools.HealingTool;

public abstract class SupportCharacter extends Character implements Heal {

    HealingTool healingTool;

    public SupportCharacter(int hitPoints, String name, HealingTool healingTool) {
        super(hitPoints, name);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void changeHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public void healAbility(Character character) {
        int healAmount = getHealingTool().getHealingValue();
        character.heal(healAmount);
    }
}
