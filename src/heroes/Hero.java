package heroes;

import enums.*;
import exceptions.InvalidItemException;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import items.*;

/**
 * The Hero class is an abstract class that represents a hero in a game.
 * It has fields for the hero's name, level, and attributes, encapsulated in a HeroAttribute class.
 * It also has a levelUp method that increases the hero's level and updates the hero's attributes.
 */

public abstract class Hero {
    public String name;
    public int level;
    public HeroAttribute levelAttributes;
    public Map<Slot, Item> equipment;
    private List<WeaponType> validWeaponTypes;
    private List<ArmorType> validArmorTypes;

    public Hero(String name, int level, HeroAttribute levelAttributes, List<WeaponType> validWeaponTypes, List<ArmorType> validArmorTypes) {
        this.name = name;
        this.level = level;
        this.levelAttributes = levelAttributes;
        this.equipment = new HashMap<>();

        // initialize each slot with a null item
        for (Slot slot : Slot.values()) {
            this.equipment.put(slot, null);
        }

        this.validWeaponTypes = validWeaponTypes;
        this.validArmorTypes = validArmorTypes;
    }

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }

    public HeroAttribute getLevelAttributes() {
        return levelAttributes;
    }

    abstract void increaseAttributes(Hero hero);

    //increase level and update the hero's attributes
    public void levelUp(){
        level++;
        //call increaseAttributes() passing current instance of the hero
        levelAttributes.increaseAttributes(this);
    }

    public void equipWeapon(Weapon weapon) throws InvalidItemException{
        // Check if the weapon's type is in the list of valid weapon types for the hero
        if(!validWeaponTypes.contains(weapon.getWeaponType())){
            throw new InvalidItemException("This hero cannot equip this type of weapon");
        }
        // Get the weapon slot
        Slot slot = weapon.getSlot();
        // Check if the slot is not filled
        if (equipment.get(slot) == null) {
            // If the slot is not filled, put the weapon in the equipment map with the slot as the key and the weapon as the value
            equipment.put(slot, weapon);
        }
    }

    public void equipArmor(Armor armor) throws InvalidItemException{
        if(!validArmorTypes.contains(armor.getArmorType())){
            throw new InvalidItemException("This hero cannot equip this type of armor");
        }
        equipment.put(armor.getSlot(), armor);
    }


}
