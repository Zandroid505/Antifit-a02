/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution11 {
    /*
     * print "How many euros are you exchanging? "
     * 'euros' = userInput (String to double)
     * print "What is the exchange rate? "
     * 'exchangeRate' = userInput
     * 'usDollars' = 'euros' * 'exchangeRate'
     * print "'euros' euros at an exchange rate of 'exchangeRate' is
     *      'usDollars' U.S. dollars."
     *
     */
    public static void main(String[] args) {
        Output userOutput = new Output();
        UserInput input = new UserInput();
        double euros;
        double exchangeRate;

        userOutput.euroPrompt();
        euros = input.scanEuros();

        userOutput.exchangeRatePrompt();
        exchangeRate = input.scanExchangeRate();

        ConversionCalculation exchanger = new ConversionCalculation(euros, exchangeRate);
        userOutput.finalOutput(exchanger.getEuros(), exchanger.getExchangeRate(), exchanger.calculateUSDollars());
    }
}
