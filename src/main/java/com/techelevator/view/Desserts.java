package com.techelevator.view;

public class Desserts extends Item {

    public Desserts(String itemCode, String itemName, Double itemPrice, String itemType) {
        super(itemCode, itemType, itemPrice, itemType);
    }

    @Override
    public String getItemType() {
        return "Dessert";
    }
}
