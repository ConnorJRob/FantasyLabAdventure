package HealingTools;

public enum HealingTool {

    CUREWOUNDS(5),
    FLASHOFLIGHT(6),
    HEALINGWORD(4),
    HEAL(8);
    ;

    private int healingValue;

    HealingTool(int healingValue) {
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return healingValue;
    }
}
