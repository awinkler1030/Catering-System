package com.techelevator;

import com.techelevator.view.*;

import java.util.List;

public class CateringSystemCLI {

    private UserInterface ui;

    private Inventory inventory;

    private CashBox cashbox;

    private Item item;

    private ShoppingCart shoppingCart;

    private Logger logger;

    public CateringSystemCLI() {
        this.ui = new UserInterface();
        this.inventory = new Inventory();
        this.cashbox = new CashBox();
        this.item = new Item();
        this.shoppingCart = new ShoppingCart();
        this.logger = new Logger();
    }

    public static void main(String[] args) {
        CateringSystemCLI cli = new CateringSystemCLI();
        cli.run();
    }


    public void run() {

        //while program running (boolean)
        boolean running = true;

        while (running) {
            String mainMenuResponse = ui.createMainMenu();
            if (mainMenuResponse.equals("1")) {
                List<Item> itemsOnList = inventory.getInventoryList();
                ui.printListOfItems(itemsOnList);
            } else if (mainMenuResponse.equals("2")) {
                boolean subMenuRunning = true;
                {
                    while (subMenuRunning) {
                        String subMenuResponse = ui.printSubMenu(cashbox.getCurrentBalance());

                        if (subMenuResponse.equals("1")) {
                            double addedAmount = Double.parseDouble(ui.askUserForAmountToAdd());
                            if (addedAmount + cashbox.getCurrentBalance() <= 5000) {
                                cashbox.addMoney(addedAmount);
                                logger.logAddMoney(addedAmount, cashbox.getCurrentBalance());
                            } else {
                                ui.printAbove5000();
                            }
                        } else if (subMenuResponse.equals("2")) {
                            List<Item> itemsOnList = inventory.getInventoryList();
                            ui.printListOfItems(itemsOnList);
                            String addedItemCode = ui.selectProductItemCode();

                            if (inventory.getProductInventory().containsKey(addedItemCode)) {
                                int addedItemQuantity = Integer.parseInt(ui.selectProductQuantity());
                                if (inventory.getProductInventory().get(addedItemCode).getItemQuantity() == 0) {
                                    ui.printSoldOut();
                                } else if (inventory.getProductInventory().get(addedItemCode).getItemQuantity() >= addedItemQuantity) {
                                    inventory.reduceItemQuantity(addedItemCode, addedItemQuantity);
                                    shoppingCart.addToShoppingCartList(addedItemCode, addedItemQuantity);
                                    cashbox.subtractMoney(inventory.getProductInventory().get(addedItemCode).getItemPrice() * addedItemQuantity);
                                    logger.logPurchase(addedItemQuantity, inventory.getProductInventory().get(addedItemCode).getItemName(), addedItemCode, inventory.getProductInventory().get(addedItemCode).getItemPrice() * addedItemQuantity, cashbox.getCurrentBalance());
                                } else {
                                    ui.printInsufficient();
                                }
                            } else {
                                ui.printInvalidItemCode();
                            }
                        } else if (subMenuResponse.equals("3")) {
                            List<Item> shoppingCartListLocal = shoppingCart.getShoppingCartList();
                            double balance = cashbox.getCurrentBalance();
                            ui.printScreenReport(shoppingCartListLocal, balance);
                            ui.printChange(balance);
                            logger.logGiveChange(balance);
                            logger.closeLogger();
                            subMenuRunning = false;
                        }
                    }
                }
            } else if (mainMenuResponse.equals("3")) {
                running = false;
            }
        }
    }
}


