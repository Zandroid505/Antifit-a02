/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution18 {

    /*
     * print "Press C to convert from Fahrenheit to Celsius.
     *        Press F to convert from Celsius to Fahrenheit."
     * print "Your choice: "
     * 'userConvChoice' = userInput
     * if('userConvChoice' == c)
     *      print "Please enter the temperature in Fahrenheit: "
     *      'fahrenheit' = userInput (String to int)
     *      'fahrenheitToCelsius' = ('fahrenheit' - 32) * (5/9)
     *      print "The temperature in Celsius is 'fahrenheitToCelsius'"
     * else
     *      print "Please enter the temperature in Celsius: "
     *      'celsius' = userInput (String to int)
     *      'celsiusToFahrenheit' = ('celsius' * (9/5)) + 32
     *      print "The temperature in Fahrenheit is 'celsiusToFahrenheit'"
     */

    public static void main(String[] args) {
        TemperatureConversion converter = new TemperatureConversion();

        converter.tempTypePrompt();
        converter.scanUserConvChoice();

        converter.checkConvType();
        converter.userTempPrompt();

        converter.scanUserTemp();
        converter.endOutput(converter.convertUserTemp());
    }
}
