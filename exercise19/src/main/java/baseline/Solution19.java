/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution19 {
    /*
     * print "What is your weight in pounds? "
     * 'weight' = userInput (String to double)
     * print "What is your height in inches? "
     * 'height' = userInput (string to int)
     *
     * 'bmi' = ('weight' / ('height' * 'height')) * 703
     * print "Your BMI is 'bmi'"
     *
     * if ((bmi > 18.5) && (bmi < 25))
     *      print "You are within the ideal weight range."
     * else if(bmi >= 25)
     *      print "You are overweight. You should see your doctor."
     * else
     *      print "You are underweight. You should see your doctor."
     *
     */
    public static void main(String[] args) {
        CalculateBMI user = new CalculateBMI();

        user.weightPromptAndScan();
        user.heightPromptAndScan();

        user.bmiCalculationsAndOutput();
        user.endOutput();
    }
}
