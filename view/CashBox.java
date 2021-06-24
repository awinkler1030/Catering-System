package com.techelevator.view;

public class CashBox {

    private double currentBalance;

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void addMoney(double addedAmount) {
        currentBalance += addedAmount;
    }

    public void subtractMoney(double subtractedAmount) {
        currentBalance -= subtractedAmount;
    }
}
