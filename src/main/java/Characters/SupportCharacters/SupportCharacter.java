package Characters.SupportCharacters;

import Characters.Character;
import HealingTools.HealingTool;

public abstract class SupportCharacter extends Character {

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
}
