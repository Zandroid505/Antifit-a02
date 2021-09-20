/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class ComputeBiggestNumber {
    private static final Scanner input = new Scanner(System.in);
    private double num1;
    private double num2;
    private double num3;
    private static final String NON_NUMERIC_INPUT_MESSAGE = "Input was not a numeric value. Enter a numerical Value.";


    public ComputeBiggestNumber() {
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
    }

    public void num1PromptAndScan() {
        while(this.num1 == 0) {
            System.out.print("Enter the first number: ");
            try {
                this.num1 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void num2PromptAndScan() {
        while(this.num2 == 0) {
            System.out.print("Enter the second number: ");
            try {
                this.num2 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void num3PromptAndScan() {
        while(this.num3 == 0) {
            System.out.print("Enter the third number: ");
            try {
                this.num3 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void checkIfNumbersAreEqual() {
        if ((this.num1 == this.num2) || (this.num1 == this.num3)
                || (this.num2 == this.num3)) {
            System.out.println("%nTwo or more of the numbers were the same");
            System.exit(-1);
        }
    }

    public void calculateAndOutputLargestNumber() {
        double biggestNumber;
        if(this.num1 > this.num2) {
            biggestNumber = this.num1;
        }else {
            biggestNumber = this.num2;
        }
        if(num3 > biggestNumber) {
            biggestNumber = this.num3;
        }

        System.out.println("The largest number is " + biggestNumber + ".");
    }
}
