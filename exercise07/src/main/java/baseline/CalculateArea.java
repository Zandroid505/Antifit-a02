/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class CalculateArea {
    private double length;
    private double width;
    private static final double IMP_TO_METRIC = 0.09290304;

    public CalculateArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double imperialArea() {
        return (length * width);
    }

    public double metricArea() {
        return(imperialArea() * IMP_TO_METRIC);
    }

}
