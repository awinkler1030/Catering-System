package com.techelevator.view;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Logger {


    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
    String formattedCurrentDateTime = currentDateTime.format(myFormatObj);
    File logFile = new File("Log.txt");
    PrintWriter writer;


    public Logger() {

        try {
            writer = new PrintWriter(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logAddMoney(double addedAmount, double balance) {

//        writer.println(formattedCurrentDateTime + " ADD MONEY: \\$" + addedAmount + " \\$" + balance);
        writer.printf("%s ADD MONEY: \\$%.2f \\$%.2f %n", formattedCurrentDateTime, addedAmount, balance);
    }

    public void logPurchase(int addedItemQuantity, String addedItemName, String addedItemCode, double subTotal, double balance) {
//        writer.println(formattedCurrentDateTime + " " + addedItemQuantity + " " + addedItemName + " " + addedItemCode + " \\$" + subTotal + " \\$" + balance);
        writer.printf("%s %i %s %s \\$%.2f \\$%.2f", formattedCurrentDateTime, addedItemQuantity, addedItemName, addedItemCode, subTotal, balance);
    }

    public void logGiveChange(double balance) {
//        writer.println(formattedCurrentDateTime + " GIVE CHANGE: \\$" + balance + " \\$0.00");
        writer.printf("%s GIVE CHANGE: \\$%.2f \\$%s %n", formattedCurrentDateTime, balance);
    }

    public void closeLogger() {
        writer.close();
    }

}
