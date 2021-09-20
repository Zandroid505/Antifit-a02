/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution20 {
    /*
     * print "What is the order amount? "
     * 'orderAmnt' = userInput (string to double)
     *
     * print "What state do you live in?"
     * 'state' = userInput
     *
     * if(state == Wisconsin)
     *      print "What county do you live in? "
     *      'county' = userInput
     *      if(county == Eau Claire)
     *          'taxRate' = 0.055
     *      else if(county == Dunn)
     *          'taxRate' = 0.054
     *      else
     *          'taxRate' = 0.05
     * else if(state == Illinois)
     *      'taxRate' = 0.08
     * else
     *      'taxRate' = 0
     *
     * 'tax' = 'orderAmnt' * 'taxRate'
     * 'total' = 'orderAmnt' + 'tax'
     *
     * print "The tax is $'tax'
     *        The total is $'total'"
     */
    public static void main(String[] args) {
        CalculateMultistateTax customer = new CalculateMultistateTax();

        customer.orderAmntPromptAndScan();
        customer.statePromptAndScan();

        customer.checkStateAndCounty();
        customer.calculateTaxAndTotal();

        customer.endOutput();
    }
}
