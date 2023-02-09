import exceptions.InvalidItemException;
import heroes.*;
import items.*;
import enums.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Mage("Gandalf");

        // Equipping a weapon that is of an invalid type
        // Weapon weapon = new Weapon("Staff of the Wise", 1, WeaponType.AXES, 5);

        Armor armor = new Armor("Robe of the Archmage", 1, Slot.BODY, ArmorType.CLOTH, new HeroAttribute(1,1,5));

        // Try to equip the weapon to the hero
        try {
            //hero.equipWeapon(weapon);
            hero.equipArmor(armor);
        } catch (InvalidItemException e) {
            // Catch the exception if the hero is unable to equip the weapon or armor
            System.out.println(e.getMessage());
        }
    }
}