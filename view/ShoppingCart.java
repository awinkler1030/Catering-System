package com.techelevator.view;

import java.util.*;

public class ShoppingCart {

    private List<Item> shoppingCartList = new ArrayList<>();
    private Inventory inventory = new Inventory();

    public List<Item> getShoppingCartList() {
        return shoppingCartList;
    }

    public void addToShoppingCartList(String addedItemCode, int addedItemQuantity) {
        Item itemToAddToCart = inventory.getProductInventory().get(addedItemCode);
        itemToAddToCart.setItemQuantity(addedItemQuantity);
        shoppingCartList.add(itemToAddToCart);
    }
}


