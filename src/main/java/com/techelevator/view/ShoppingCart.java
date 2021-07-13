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


//    Inventory inventory = new Inventory();
//    Item itemToAddToCart = new Item();
//    int userChoiceQuantity;
//
//    int shoppingCartItemQuantity = getShoppingCartItemQuantity();
//
//
//
//    public void itemOfUserChoice(String userChoiceItemCode,int userQuantity) {
//        itemToAddToCart = inventory.getProductInventory().get(userChoiceItemCode);
//        userChoiceQuantity = userQuantity;
//    }
//
//
//
//    List<Item> shoppingCartList = new ArrayList<>();
////    Map<String, Item> shoppingCartMap = new TreeMap<>() {
////
////    };
//    String addItemCodeResponse;
//    int updatedItemQuantity;
//    Item itemToCart = new Item();
//
////    Inventory inventory = new Inventory();
//    public int getShoppingCartItemQuantity() {
//        return shoppingCartItemQuantity;
//    }
//
//    public void setAddItemQuantity(int addItemQuantity) {
//        itemToCart.setItemQuantity(addItemQuantity);
//    }
//
////    public void addToCart(String addedItemCode) {
////
////        itemToAddToCart.setItemCode(addedItemCode);
////        itemToAddToCart.setItemQuantity(addedItemQuantity);
////        shoppingCartList.add(itemToAddToCart);
//
////        inventory.getProductInventory().get(addItemCodeResponse).getItemQuantity()
//
////                getProductInventory().get(itemCode).setItemQuantity(addItemQuantity);

    }

//    public void addtoCart(Item item) {
//        rosterMap.put(player.getJerseyNumber(), player );
//    }



