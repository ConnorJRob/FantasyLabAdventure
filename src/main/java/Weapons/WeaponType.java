package Weapons;

public enum WeaponType {

    SWORD(5),
    AXE(6),
    CLUB(4);

    private final int damageAmount;

    WeaponType(int damageAmount){
        this.damageAmount = damageAmount;
    }

    public int getDamageAmount(){
        return this.damageAmount;
    }
}
