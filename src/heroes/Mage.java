package heroes;

public class Mage extends Hero{
    public Mage(String name, int level, HeroAttribute levelAttributes) {
        super(name, level, levelAttributes);
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
