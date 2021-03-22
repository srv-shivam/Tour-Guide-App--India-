package com.example.myindia;

public class Item {

    private String mitemName;

    private int mitemImages = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Item(String itemName, int itemImages) {
        this.mitemName = itemName;
        this.mitemImages = itemImages;
    }

    public Item(String mitemName) {
        this.mitemName = mitemName;
    }

    public String getItemName() {
        return mitemName;
    }

    public int getItemImages() {
        return mitemImages;
    }

    public boolean hasImage() {
        return mitemImages != NO_IMAGE_PROVIDED;
    }
}
