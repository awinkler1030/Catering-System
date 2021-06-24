package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ItemFileReader {

    public Map<String, Item> loadData() {
        Map<String, Item> productInventory = new TreeMap<>();

        try {
            File cateringSystemFile = new File("cateringsystem.csv");
            Scanner dataScanner = new Scanner(cateringSystemFile);
            while (dataScanner.hasNextLine()) {
                String dataLine = dataScanner.nextLine();
                String[] data = dataLine.split("\\|");
                String itemCode = data[0];
                String itemName = data[1];
                String itemPrice = data[2];
                String itemType = data[3];

                Item item = new Item(itemCode, itemName, Double.parseDouble(itemPrice), itemType);
                productInventory.put(itemCode, item);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return productInventory;

    }

}
