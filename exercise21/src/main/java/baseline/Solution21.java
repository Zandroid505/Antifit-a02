/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution21 {
    /*
     * print "Please enter the number of the month: "
     * 'monthNumber' = userInput (String to int)
     * Use Switch statement to select month
     *      'month' = month string
     * print "The name of the month is 'month'
     */
    public static void main(String[] args) {
        ComputeMonth monthChecker = new ComputeMonth();

        monthChecker.monthPromptAndScan();
        monthChecker.assignMonth();

        monthChecker.endOutput();
    }
}
