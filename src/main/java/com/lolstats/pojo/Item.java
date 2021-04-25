package com.lolstats.pojo;

public class Item {

    private boolean canUse;
    private boolean consumable;
    private long count;
    private String displayName;
    private long itemID;
    private long price;
    private String rawDescription;
    private String rawDisplayName;
    private long slot;

    public boolean getCanUse() {
        return canUse;
    }

    public void setCanUse(boolean value) {
        this.canUse = value;
    }

    public boolean getConsumable() {
        return consumable;
    }

    public void setConsumable(boolean value) {
        this.consumable = value;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long value) {
        this.count = value;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String value) {
        this.displayName = value;
    }

    public long getItemID() {
        return itemID;
    }

    public void setItemID(long value) {
        this.itemID = value;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long value) {
        this.price = value;
    }

    public String getRawDescription() {
        return rawDescription;
    }

    public void setRawDescription(String value) {
        this.rawDescription = value;
    }

    public String getRawDisplayName() {
        return rawDisplayName;
    }

    public void setRawDisplayName(String value) {
        this.rawDisplayName = value;
    }

    public long getSlot() {
        return slot;
    }

    public void setSlot(long value) {
        this.slot = value;
    }

}
