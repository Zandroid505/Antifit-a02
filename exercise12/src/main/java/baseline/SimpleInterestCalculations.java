/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class SimpleInterestCalculations {
    private double principal;
    private double interestRate;
    private int years;
    private double amountFinal;

    public SimpleInterestCalculations() {
        this.principal = 0;
        this.interestRate = 0;
        this.years = 0;
        this.amountFinal = 0;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return this.years;
    }

    public double CalculateAmountFinalAndRound() {
        this.amountFinal = this.principal * (1 + (this.years * (this.interestRate / 100)));

        //Rounds decimal up one cent if fractional
        if (this.amountFinal >= (this.amountFinal + 0.001)) {
            this.amountFinal *= 100;
            this.amountFinal += 0.5;
            this.amountFinal = this.amountFinal / 100;
        }

        return this.amountFinal;
    }

}
