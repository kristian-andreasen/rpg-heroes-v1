package items;

import enums.Slot;

public abstract class Item {
    private String name;
    private int requiredLevel;

    private Slot slot;

    public Item(String name, int requiredLevel, Slot slot) {
        this.name = name;
        this.requiredLevel = requiredLevel;
        this.slot = slot;
    }

    public Slot getSlot() {
        return slot;
    }
}
