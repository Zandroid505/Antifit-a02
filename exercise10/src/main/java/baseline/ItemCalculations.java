/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class ItemCalculations {
    private double itemPrice;
    private int itemQuantity;
    private static final double TAX_RATE = 0.055;

    public ItemCalculations() {
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double calculateTotalItemPrice() {
        return (this.itemPrice * this.itemQuantity);
    }

    public double calculateTax(double subtotal) {
        return (subtotal * TAX_RATE);
    }

    public double calculateShopTotal(double subtotal) {
        return (subtotal + calculateTax(subtotal));
    }
}
