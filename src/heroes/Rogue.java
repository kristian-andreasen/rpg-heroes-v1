package heroes;

import enums.ArmorType;
import enums.WeaponType;

import java.util.List;

public class Rogue extends Hero{
    public Rogue(String name, int level, HeroAttribute levelAttributes, List<WeaponType> validWeaponTypes, List<ArmorType> validArmorTypes) {
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
        int updatedStrength = currentStrength + 2;
        int updatedDexterity = currentDexterity + 6;
        int updatedIntelligence = currentIntelligence + 1;

        // Set the updated values of strength, dexterity, and intelligence
        attributes.setStrength(updatedStrength);
        attributes.setDexterity(updatedDexterity);
        attributes.setIntelligence(updatedIntelligence);
    }
}
