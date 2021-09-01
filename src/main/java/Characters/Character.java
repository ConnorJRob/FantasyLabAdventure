package Characters;

public abstract class Character {

    private int hitPoints;
    private String name;

    public Character(int hitPoints, String name) {
        this.hitPoints = hitPoints;
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage){
        this.hitPoints -= damage;
    }

    public void heal(int healAmount){
        this.hitPoints += healAmount;
    }
}
