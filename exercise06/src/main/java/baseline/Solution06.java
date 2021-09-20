/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class Solution06 {
    private static final Scanner input = new Scanner(System.in);
    /*
     * print "What is your current age?"
     * 'userAge' = userInput (convert from string to int)
     * print "At what age would you like to retire?"
     * 'retireAge' = userInput
     * 'yearsTillRetire' = 'retireAge' - 'userAge'
     * 'currentYear' = now() (method in java.time.Year)
     * 'retireYear' = currentYear + yearsTillRetire
     * print "You have 'yearsTillRetire' years left until you can retire
     * print "It's 'currentYear', so you can retire in 'retireYear'
     */
    public static void main(String[] args) {
        int userAge;
        int retireAge;

        System.out.print("What is your current age? ");
        userAge = Integer.parseInt(input.nextLine());

        System.out.print("At what age would you like to retire? ");
        retireAge = Integer.parseInt(input.nextLine());

        CalculateRetire userInfo = new CalculateRetire(userAge, retireAge);

        System.out.printf("You have %d years left until you can retire.%n", userInfo.yearsTillRetire());
        System.out.printf("It's %d, so you can retire in %d%n", userInfo.getCurrentYear(), userInfo.retireYear());
    }
}
