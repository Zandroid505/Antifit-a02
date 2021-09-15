/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution10 {
    /*
     * print "Enter the price of item 1: "
     * 'item1Price' = userInput (convert String to double)
     * print "Enter the quantity of item 1: "
     * 'item1Amnt' = userInput
     * 'item1TotPrice' = 'item1Price' * 'item1Amnt'
     *
     * print "Enter the price of item 2: "
     * 'item2Price' = userInput (convert String to double)
     * print "Enter the quantity of item 2: "
     * 'item2Amnt' = userInput
     * * 'item2TotPrice' = 'item2Price' * 'item2Amnt'
     *
     * print "Enter the price of item 3: "
     * 'item3Price' = userInput (convert String to double)
     * print "Enter the quantity of item 3: "
     * 'item3Amnt' = userInput
     * * 'item3TotPrice' = 'item3Price' * 'item3Amnt'
     *
     * 'TAX_RATE' = 0.055
     * 'subtotal' = 'item1TotPrice' + 'item2TotPrice' + 'item3TotPrice'
     * 'tax' = 'subtotal' * 'subtotal'
     * 'total' = 'tax' + 'subtotal'
     *
     * print "Subtotal: $'subtotal'
     * print "Tax: $'tax'
     * print "Total: $'total'
     */
    public static void main(String[] args) {
        ItemCalculations[] itemList = new ItemCalculations[3];
        Output output = new Output();
        UserInput input = new UserInput();

        for(int i = 0; i < 3; i++) {
            itemList[i] = new ItemCalculations();

            output.pricePrompt(i+1);
            itemList[i].setItemPrice(input.scanPrice());

            output.quantityPrompt(i+1);
            itemList[i].setItemQuantity(input.scanQuantity());

            itemList[i].calculateTotalItemPrice();
        }

        output.printOutput(itemList[2]);
    }
}
