/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class PaintCalculation {
    private double length;
    private double width;
    private double area;
    private int gallonsNeeded;
    private static final int AREA_PER_GALLON = 350;

    public PaintCalculation() {
        this.length = 0;
        this.width = 0;
        this.area = 0;
    }

    public void askForLength() {
        System.out.print("What is the length of your ceiling? ");
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void askForWidth() {
        System.out.print("What is the width of your ceiling? ");
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void calculateArea() {
        this.area = (this.length * this.width);
    }

    public void calculateGallonsNeeded() {
        this.gallonsNeeded = (int)this.area / AREA_PER_GALLON;
    }

    public void morePaintCheck() {
        if(this.area % AREA_PER_GALLON != 0) {
            this.gallonsNeeded++;
        }
    }

    public void outputGallonsNeeded() {
        System.out.printf("You will need to purchase %d gallon(s) of paint to cover %.2f square feet.", this.gallonsNeeded, this.area);
    }
}