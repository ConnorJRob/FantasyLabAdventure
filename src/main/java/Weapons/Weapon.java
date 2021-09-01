package Weapons;

public class Weapon {

    private String name;
    private WeaponType weaponType;

    public Weapon(String name, WeaponType weaponType) {
        this.name = name;
        this.weaponType = weaponType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
