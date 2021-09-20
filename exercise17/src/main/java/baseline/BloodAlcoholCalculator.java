/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class BloodAlcoholCalculator {
    private static final Scanner input = new Scanner(System.in);
    private int sex ;
    private double alcoholRatio;
    private double amntAlcohol;
    private double weight;
    private int hoursSinceLastDrink;
    private double bac;
    private static final String NON_NUMERIC_INPUT_MESSAGE = "Input was not a numeric value. Enter a numerical Value.";

    public BloodAlcoholCalculator() {
        this.sex = 0;
        this.alcoholRatio = 0;
        this.amntAlcohol = 0;
        this.weight = 0;
        this.hoursSinceLastDrink = 0;
        this.bac = 0;
    }

    public void scanSex() {
        while(this.sex == 0) {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            try {
                this.sex = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void checkSex() {
        if(this.sex == 1) {
            this.alcoholRatio = 0.73;   //Ratio for men
        }else {
            this.alcoholRatio = 0.66;   //Ratio for women
        }
    }

    public void scanAmntAlcohol() {
        while(this.amntAlcohol == 0) {
            System.out.print("How many ounces of alcohol did you have? ");
            try {
                this.amntAlcohol = Double.parseDouble(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void scanWeight() {
        while(this.weight == 0) {
            System.out.print("What is your weight, in pounds? ");
            try {
                this.weight = Double.parseDouble(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void scanHoursSinceLastDrink() {
        while(this.hoursSinceLastDrink == 0) {
            System.out.print("How many hours has it been since your last drink? ");
            try {
                this.hoursSinceLastDrink = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(NON_NUMERIC_INPUT_MESSAGE);
            }
        }
    }

    public void calculateBac() {
        this.bac = ((this.amntAlcohol * 5.14) / this.weight * this.alcoholRatio) - 0.015 * this.hoursSinceLastDrink;
    }

    public void endOutput() {
        System.out.printf("%nYour BAC is %f%n", this.bac);
        if(this.bac < 0.08) {
            System.out.println("It is legal for you to drive.");
        }else {
            System.out.println("It is not legal for you to drive.");
        }
    }
}
