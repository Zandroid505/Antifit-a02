/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution17 {
    /*
     * print "Enter a 1 is you are male or a 2 if you are female: "
     * 'sex' = userInput (Check if numeric)
     * if(male)
     *      'alcoholRatio' = 0.73
     * if(female)
     *      'alcoholRatio' = 0.66
     *
     * print "How many ounces of alcohol did you have? "
     * 'amntAlcohol' = userInput (Check if numeric)
     *
     * print "What is your weight, in pounds? "
     * 'weight' = userInput (Check if numeric)
     *
     * print "How many hours has it been since your last drink? "
     * 'hoursSinceLastDrink' = userInput (Check if numeric)
     *
     * 'bac' = (('amntAlcohol' * 5.14) / ('weight' * 'alcoholRatio')) - 0.15 * 'hoursSinceLastDrink'
     * print "Your BAC is 'bac'"
     * if(bac < 0.08)
     *      print "It is legal for you to drive."
     * else
     *      print "It is not legal for you to drive."
     *
     */
    public static void main(String[] args) {
        BloodAlcoholCalculator drinker = new BloodAlcoholCalculator();

        drinker.scanSex();
        drinker.checkSex();

        drinker.scanAmntAlcohol();
        drinker.scanWeight();

        drinker.scanHoursSinceLastDrink();
        drinker.calculateBac();

        drinker.calculateBac();
        drinker.endOutput();

    }
}
