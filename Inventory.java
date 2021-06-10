package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Inventory {

    private Map<String, Item> productInventory;
    private int itemQuantity = 50;


    public Inventory() {
        ItemFileReader itemFileReader = new ItemFileReader();
        productInventory = itemFileReader.loadData();
    }

    public Map<String, Item> getProductInventory() {
        return productInventory;
    }


    public List<Item> getInventoryList() {

        List<Item> listOfItems = new ArrayList<>();
        Set<String> keys = productInventory.keySet();

        for (String key : keys) {

            listOfItems.add(productInventory.get(key));
        }
        return listOfItems;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void reduceItemQuantity(String itemCode, int addItemQuantity) {

        productInventory.get(itemCode).setItemQuantity(getItemQuantity() - addItemQuantity);

    }

}




