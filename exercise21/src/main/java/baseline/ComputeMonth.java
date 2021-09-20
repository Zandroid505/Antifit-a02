/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class ComputeMonth {
    private static final Scanner input = new Scanner(System.in);
    private int monthNumber;
    private String month;
    private static final String NON_NUMERIC_INPUT_MESSAGE = "Input was not a numeric value. Enter a numerical Value.";

    public ComputeMonth() {
        this.monthNumber = 0;
        this.month = "";
    }

    public void monthPromptAndScan() {
        while(this.monthNumber == 0) {
            System.out.print("Please enter the number of the month: ");
            try {
                this.monthNumber = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void assignMonth() {
        switch(monthNumber) {
            case 1:
                this.month = "January";
                break;
            case 2:
                this.month = "February";
                break;
            case 3:
                this.month = "March";
                break;
            case 4:
                this.month = "April";
                break;
            case 5:
                this.month = "May";
                break;
            case 6:
                this.month = "June";
                break;
            case 7:
                this.month = "July";
                break;
            case 8:
                this.month = "August";
                break;
            case 9:
                this.month = "September";
                break;
            case 10:
                this.month = "October";
                break;
            case 11:
                this.month = "November";
                break;
            case 12:
                this.month = "December";
                break;
            default:
                this.month = "Invalid month";

        }
    }

    public void endOutput() {
        System.out.println("The name of the month is " + this.month + ".");
    }
}
