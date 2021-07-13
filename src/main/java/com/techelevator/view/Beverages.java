package com.techelevator.view;

public class Beverages extends Item {

    public Beverages(String itemCode, String itemName, Double itemPrice, String itemType) {
        super(itemCode, itemType, itemPrice, itemType);
    }

    @Override
    public String getItemType() {
        return "Beverage";
    }
}
