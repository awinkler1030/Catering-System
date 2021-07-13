package com.techelevator.view;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    // kind of looks like a menu class if you ask me ;-)
    private Scanner scanner;

    CashBox cashbox = new CashBox();
    Item item = new Item();
    ShoppingCart shoppingCart = new ShoppingCart();

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public String createMainMenu() {
        System.out.println("***************************");
        System.out.println("Java Green Catering App 3000");
        System.out.println("***************************\n");

        System.out.println("(1) Display Catering Items");
        System.out.println("(2) Order");
        System.out.println("(3) Quit\n");

        System.out.println("Please select your choice (number only): ");

        String mainMenuResponse = scanner.nextLine();
        return mainMenuResponse;
    }

    public void printListOfItems(List<Item> listOfItems) {

        System.out.printf("%-10s %-10s %-25s %16s %15s %n", "Item Code", "Item Type", "Item Name", "Item Price", "Item Quantity");

        for (Item item : listOfItems) {
            printItem(item);
        }

    }

    public void printItem(Item item) {

        System.out.printf("%-10s %-10s %-25s %10.2f %10d %n", item.getItemCode(), item.getItemType(), item.getItemName(), item.getItemPrice(), item.getItemQuantity());

    }

    public String printSubMenu(double balance) {

        System.out.println("(1) Add Money");
        System.out.println("(2) Select Products");
        System.out.println("(3) Complete Transaction");
        System.out.printf("Current Account Balance: $%.2f %n", balance);

        System.out.println("Please select your choice (number only): ");

        String subMenuResponse = scanner.nextLine();
        return subMenuResponse;
    }

    public String askUserForAmountToAdd() {
        System.out.println("PLease enter the amount of money (in whole dollars) you would like to add: ");

        String addMoneyResponse = scanner.nextLine();
        return addMoneyResponse;

    }

    public void printAbove5000() {
        System.out.println("Balance cannot go above $5000");
    }

    public String selectProductItemCode() {
        System.out.println("PLease enter the Item Code (as written) for the product you would like to select: ");

        String addItemCodeResponse = scanner.nextLine();
        return addItemCodeResponse;
    }

    public String selectProductQuantity() {
        System.out.println("PLease enter the quantity (as a whole number) for the product you would like to select: ");

        String addQuantityResponse = scanner.nextLine();
        return addQuantityResponse;
    }

    public void printInsufficient() {
        System.out.println("Insufficient Stock");
    }

    public void printSoldOut() {
        System.out.println("SOLD OUT");
    }

    public void printInvalidItemCode() {
        System.out.println("The product code you selected does not exist.");
    }

    public void printScreenReport(List<Item> shoppingCartList, double balance) {

        System.out.println("Screen Report");
        double total = 0.0;
        for (Item item : shoppingCartList) {

            System.out.printf("%-5d %-5s %-25s $%-10.2f $%-10.2f %n", item.getItemQuantity(), item.getItemType(), item.getItemName(), item.getItemPrice(), item.getItemQuantity() * item.getItemPrice());

            total += item.getItemQuantity() * item.getItemPrice();
        }
        System.out.printf("Total: $%.2f %n", total);
        System.out.printf("Change back: $%.2f %n", balance);
    }

    public void printChange(double currentBalance) {
        int quantityOf20s = (int) currentBalance / 20;
        double remainderOf20s = currentBalance % 20;
        int quantityOf10s = (int) (remainderOf20s / 10);
        double remainderOf10s = remainderOf20s % 10;
        int quantityOf5s = (int) (remainderOf10s / 5);
        double remainderOf5s = remainderOf10s % 5;
        int quantityOf1s = (int) remainderOf5s / 1;
        double remainderOf1s = remainderOf5s % 1;
        int quantityOfQuarters = (int) (remainderOf1s / 0.25);
        double remainderOfQuarters = remainderOf1s % 0.25;
        int quantityOfDimes = (int) (remainderOfQuarters / 0.1);
        double remainderOfDimes = remainderOfQuarters % 0.1;
        int quantityOfNickels = (int) (remainderOfDimes / 0.05);
        double remainderOfNickels = remainderOfDimes % 0.05;
        int quantityOfPennies = (int) (remainderOfNickels / 0.01);


        if (quantityOf20s != 0) {
            System.out.println(quantityOf20s + " X $20.00");
        }
        if (quantityOf10s != 0) {
            System.out.println(quantityOf10s + " X $10.00");
        }
        if (quantityOf5s != 0) {
            System.out.println(quantityOf5s + " X $5.00");
        }
        if (quantityOf1s != 0) {
            System.out.println(quantityOf1s + " X $1.00");
        }
        if (quantityOfQuarters != 0) {
            System.out.println(quantityOfQuarters + " X 25¢");
        }
        if (quantityOfDimes != 0) {
            System.out.println(quantityOfDimes + " X 10¢");
        }
        if (quantityOfNickels != 0) {
            System.out.println(quantityOfNickels + " X 5¢");
        }
        if (quantityOfPennies != 0) System.out.println(quantityOfPennies + " X 1¢");
    }
}
