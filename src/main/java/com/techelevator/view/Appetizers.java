package com.techelevator.view;

public class Appetizers extends Item {

    public Appetizers(String itemCode, String itemName, Double itemPrice, String itemType) {
        super(itemCode, itemType, itemPrice, itemType);
    }

    @Override
    public String getItemType() {
        return "Appetizer";
    }
}
