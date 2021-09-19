/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution14 {
    /*
     * print "What is the order amount? "
     * 'orderAmount' = userInput (String to double)
     * print "What is the state? "
     * 'state' = userInput
     * 'Tax' = 0
     * if('state' == "WI") (Use string equals() method)
     *      tax = 0.055
     * 'total' = 'tax'  'orderAmount'
     * print "The subtotal is $'orderAmount'
     *          The tax is 'tax'
     *          The total is 'total'"
     */
    public static void main(String[] args) {
        UserInput input = new UserInput();
        Output outputDirections = new Output();
        TaxCalculations currentPerson = new TaxCalculations();

        outputDirections.orderAmountPrompt();
        input.convertAndSetOrderAmount();

        outputDirections.statePrompt();
        input.setUserState();

        currentPerson.checkStateAndCalculateTax(input.getUserState(), input.getOrderAmount());
        outputDirections.endOutput(currentPerson.calculateTotal(input.getOrderAmount()), currentPerson.getTax(), input.getOrderAmount());




    }
}
