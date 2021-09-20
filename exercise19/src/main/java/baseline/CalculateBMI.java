/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class CalculateBMI {
    private static final Scanner input = new Scanner(System.in);
    private double weight;
    private int height;
    private double bmi;
    private static final String NON_NUMERIC_INPUT_MESSAGE = "Input was not a numeric value. Enter a numerical Value.";

    public CalculateBMI() {
        this.weight = 0;
        this.height = 0;
    }

    public void weightPromptAndScan() {
        while(this.weight == 0) {
            System.out.print("What is your weight in pounds? ");
            try {
                this.weight = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void heightPromptAndScan() {
        while(this.height == 0) {
            System.out.print("What is your height in inches? ");
            try {
                this.height = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void bmiCalculationsAndOutput() {
        this.bmi = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.2f%n", this.bmi);
    }

    public void endOutput() {
        if((this.bmi > 18.5) && (this.bmi < 25)) {
            System.out.println("You are within the ideal weight range.");
        }else if(this.bmi >= 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }else {
            System.out.println("You are underweight. You should see your doctor.");
        }
    }
}
