package com.techelevator.view;

public class Entrees extends Item {

    public Entrees(String itemCode, String itemName, Double itemPrice, String itemType) {
        super(itemCode, itemType, itemPrice, itemType);
    }

    @Override
    public String getItemType() {
        return "Entree";
    }
}
