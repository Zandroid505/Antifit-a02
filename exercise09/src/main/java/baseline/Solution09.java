/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class Solution09 {
    /*
     * print "What is the length of your ceiling?"
     * 'length' = userInput (convert string to int)
     * print "What is the width of your ceiling?"
     * 'width' = userInput
     * 'area' = 'length' * 'width'
     * 'AREA_PER_GALLON' = 350
     * 'gallonsNeeded' = 'area' / 'AREA_PER_GALLON'
     * if('area' % AREA_PER_GALLON != 0)
     *      gallonsNeeded++
     * print "You will need to purchase 'gallonsNeeded' gallons of paint to cover 'area' square feet."
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PaintCalculation painter1 = new PaintCalculation();

        painter1.askForLength();
        painter1.setLength(Double.parseDouble(input.nextLine()));

        painter1.askForWidth();
        painter1.setWidth(Double.parseDouble(input.nextLine()));

        painter1.calculateArea();
        painter1.calculateGallonsNeeded();

        painter1.morePaintCheck();
        painter1.outputGallonsNeeded();
    }
}
