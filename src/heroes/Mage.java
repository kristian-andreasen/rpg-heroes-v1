package heroes;

import enums.ArmorType;
import enums.WeaponType;

import java.util.List;

public class Mage extends Hero{
    // instance field which is a constant list of valid weapon types for a mage.
    // the list is created using the List.of() method which returns a list with the elements specified.
    private static final List<WeaponType> mageValidWeaponTypes = List.of(WeaponType.STAFFS, WeaponType.WANDS);
    private static final List<ArmorType> mageValidArmorTypes = List.of(ArmorType.CLOTH);

    public Mage(String name, int level, HeroAttribute levelAttributes, List<WeaponType> validWeaponTypes, List<ArmorType> validArmorTypes) {
        super(name, level, levelAttributes, validWeaponTypes, validArmorTypes);
    }

    @Override
    // the levelUp method passes the current hero instance to increaseAttributes
    void increaseAttributes(Hero hero) {
        // retrieve the current level attributes for the hero
        HeroAttribute attributes = hero.getLevelAttributes();

        // retrieve the current strength, dexterity, and intelligence for the hero
        int currentStrength = attributes.getStrength();
        int currentDexterity = attributes.getDexterity();
        int currentIntelligence = attributes.getIntelligence();

        //// Calculate the updated values of strength, dexterity, and intelligence
        int updatedStrength = currentStrength + 1;
        int updatedDexterity = currentDexterity + 1;
        int updatedIntelligence = currentIntelligence + 5;

        // Set the updated values of strength, dexterity, and intelligence
        attributes.setStrength(updatedStrength);
        attributes.setDexterity(updatedDexterity);
        attributes.setIntelligence(updatedIntelligence);
    }
}
