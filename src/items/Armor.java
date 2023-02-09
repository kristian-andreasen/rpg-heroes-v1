import enums.ArmorType;
import enums.Slot;
import heroes.HeroAttribute;

public class Armor extends Item{
    private ArmorType armorType;
    private HeroAttribute armorAttributes;

    public Armor(String name, int requiredLevel, Slot slot, ArmorType armorType, HeroAttribute armorAttributes) {
        super(name, requiredLevel, slot);
        this.armorType = armorType;
        this.armorAttributes = armorAttributes;
    }
}
