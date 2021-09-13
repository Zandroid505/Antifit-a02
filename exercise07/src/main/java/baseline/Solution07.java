/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class Solution07 {
    /*
     * print "What is the length of the room in feet?"
     * 'length' = userInput (convert string to double)
     * print "What is the width of the room in feet?"
     * 'width' = userInput
     * 'areaImperial' = 'length' * 'width'
     * 'IMP_TO_METRIC' = 0.09290304
     * 'areaMetric' = 'areaFeet' * 'IMP_TO_METRIC'
     * print "You entered dimensions of 'length' feet by 'width' feet."
     * print "The area is"
     * print "'areaFeet' square feet
     * print "'areaMeters' square meters
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;

        System.out.print("What is the length of the room in feet? ");
        length = Double.parseDouble(input.nextLine());

        System.out.print("What is the width of the room in feet? ");
        width = Double.parseDouble(input.nextLine());

        CalculateArea userRoom = new CalculateArea(length, width);

        System.out.printf("You entered dimensions of %f feet by %f feet%n", length, width);
        System.out.printf("The area is%n%.3f square feet%n%.3f square meters%n", userRoom.imperialArea(), userRoom.metricArea());
    }
}
