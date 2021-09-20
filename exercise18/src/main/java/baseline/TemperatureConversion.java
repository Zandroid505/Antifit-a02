/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class TemperatureConversion {
    private static final Scanner input = new Scanner(System.in);
    private char userConvChoice;
    private double userTemp;
    private String originalTempType;

    public TemperatureConversion() {
        this.userTemp = 0;
        this.originalTempType = "";
    }

    public void tempTypePrompt() {
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        System.out.print("Your Choice: ");
    }

    public void scanUserConvChoice() {
        String userConvChoicetemp = input.nextLine();
        this.userConvChoice = userConvChoicetemp.charAt(0);
    }

    public void checkConvType() {
        if(this.userConvChoice == 'c' || this.userConvChoice == 'C') {
            this.originalTempType = "Fahrenheit";
        }else if(this.userConvChoice == 'f' || this.userConvChoice == 'F') {
            this.originalTempType = "Celsius";
        }
    }

    public void userTempPrompt() {
        System.out.printf("Please enter the temperature in %s: ", this.originalTempType);
    }

    public void scanUserTemp() {
        this.userTemp = Double.parseDouble(input.nextLine());
    }

    public double convertUserTemp() {
        if(this.originalTempType.equals("Celsius")) {
            return (this.userTemp * ((double)9 / 5)) + 32;
        }else {
            return (this.userTemp - 32) * ((double)5/9);
        }
    }

    public void endOutput(double convertedTemp) {
        System.out.printf("The temperature in %s is %.2f", this.originalTempType, convertedTemp);
    }
}
