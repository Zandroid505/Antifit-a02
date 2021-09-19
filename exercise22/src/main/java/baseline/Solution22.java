/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution22 {
    /*
     * print "Enter the first number: "
     * 'num1' = userInput (string to double)
     *
     * print "Enter the second number: "
     * 'num2' = userInput
     *
     * print "Enter the third number: "
     * 'num3' = userInput
     *
     * if (!(num1 == num2) && !(num1 == num3) && !(num2 == num3))
     *      exit program
     *
     * if(num1 > num2)
     *      'biggestNum' = 'num1'
     * else
     *      'biggestNum' = 'num2'
     * if(num3 > 'biggestNum')
     *      'biggestNum' = num3
     */
    public static void main(String[] args) {
        ComputeBiggestNumber numberPerson = new ComputeBiggestNumber();

        numberPerson.num1PromptAndScan();
        numberPerson.num2PromptAndScan();
        numberPerson.num3PromptAndScan();

        numberPerson.checkIfNumbersAreEqual();
        numberPerson.calculateAndOutputLargestNumber();
    }
}
