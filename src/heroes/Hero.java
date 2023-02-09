package heroes;

/**
 * The Hero class is an abstract class that represents a hero in a game.
 * It has fields for the hero's name, level, and attributes, encapsulated in a HeroAttribute class.
 * It also has a levelUp method that increases the hero's level and updates the hero's attributes.
 */

abstract class Hero {
    public String name;
    public int level;
    public HeroAttribute levelAttributes;

    public Hero(String name, int level, HeroAttribute levelAttributes) {
        this.name = name;
        this.level = level;
        this.levelAttributes = levelAttributes;
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
}
