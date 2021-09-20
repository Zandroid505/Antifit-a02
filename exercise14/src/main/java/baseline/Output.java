/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Output {

    public void orderAmountPrompt() {
        System.out.print("What is the order amount? ");
    }

    public void statePrompt() {
        System.out.print("What is the state? ");
    }

    public void endOutput(double total, double tax, double orderAmount) {
        System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%nThe total is $%.2f", orderAmount, tax, total);
    }
}
