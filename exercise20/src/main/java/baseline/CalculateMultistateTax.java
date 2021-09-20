/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class CalculateMultistateTax {
    private static final Scanner input = new Scanner(System.in);
    private double orderAmnt;
    private String state;
    private String county;
    private double taxRate;
    private double tax;
    private double total;

    public CalculateMultistateTax() {
        this.orderAmnt = 0;
        this.state = "";
        this.county = "";
        this.taxRate = 0;
        this.tax = 0;
        this.total = 0;
    }

    public void orderAmntPromptAndScan() {
        System.out.print("What is the order amount? ");
        this.orderAmnt = Double.parseDouble(input.nextLine());
    }

    public void statePromptAndScan() {
        System.out.print("What state do you live in? ");
        this.state = input.nextLine();
    }

    public void checkStateAndCounty() {
        if(this.state.equals("Wisconsin") || this.state.equals("wisconsin")) {
            System.out.print("What county do you live in? ");
            this.county = input.nextLine();

            if(this.county.equals("Eau Claire") || this.county.equals("eau claire")) {
                this.taxRate = 0.055;
            }else if(this.county.equals("Dunn") || this.county.equals("dunn")) {
                this.taxRate = 0.054;
            }else {
                this.taxRate = 0.05;
            }
        }else if(this.state.equals("Illinois") || this.state.equals("illinois")) {
            this.taxRate = 0.08;
        }else {
            this.taxRate = 0;
        }
    }

    public void calculateTaxAndTotal() {
        this.tax = this.orderAmnt * this.taxRate;
        if (this.tax >= (this.tax + 0.001)) {
            this.tax *= 100;
            this.tax += 0.5;
            this.tax /= 100;
        }

        this.total = this.orderAmnt  + this.tax;
        if (this.total >= (this.total + 0.001)) {
            this.total *= 100;
            this.total += 0.5;
            this.total /= 100;
        }
    }

    public void endOutput() {
        System.out.printf("The tax is $%.2f%nThe total is $%.2f", this.tax, this.total);
    }
}
