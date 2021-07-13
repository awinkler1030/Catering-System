package com.techelevator.view;

public class Item {

    private String itemCode;
    private String itemType;
    private Double itemPrice;
    private String itemName;
    private int itemQuantity = 50;

    public Item() { };

    public Item(String itemCode, String itemName, double itemPrice, String itemType) {
        this.itemCode = itemCode;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
    }

//    ShoppingCart shoppingCart = new ShoppingCart();

    public String getItemCode() {
        return itemCode;
    }

    public String getItemType() {
        return itemType;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemQuantity(int itemQuantity) {

        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }



}

