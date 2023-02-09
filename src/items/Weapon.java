import enums.Slot;
import enums.WeaponType;

public class Weapon extends Item{
    public WeaponType weaponType;
    public int weaponDamage;

    public Weapon(String name, int requiredLevel, WeaponType weaponType, int weaponDamage) {
        super(name, requiredLevel, Slot.WEAPON);
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
    }
}
