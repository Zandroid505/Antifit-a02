/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class Solution13 {
    private static final Scanner input = new Scanner(System.in);
    /*
     * print "What is the principal amount? "
     * 'principal' = userInput (String to double)
     * print "What is the rate? "
     * 'interestRate' = userInput
     * print "What is the number of years? "
     * 'years' = userInput
     * print "What is the number of times the interest is compounded per year? "
     * 'numTimesCompounded' = userInput
     * 'amountFinal' = 'principal' * (1 + 'interestRate'/'numTimesCompounded')^('numTimesCompounded' * 'years')
     * Round 'amountFinal' up one cent if fractional
     * print "'principal' invested at 'interestRate'% for 'years' years compounded 'numTimesCompounded' times per year is $'amountFinal.'
     */
    public static void main(String[] args) {
        CompoundInterestCalculations accountOwner = new CompoundInterestCalculations();

        System.out.print("What is the principal amount? ");
        accountOwner.setPrincipal(Double.parseDouble(input.nextLine()));

        System.out.print("What is the rate? ");
        accountOwner.setInterestRate(Double.parseDouble(input.nextLine()));

        System.out.print("What is the number of years? ");
        accountOwner.setYears(Integer.parseInt(input.nextLine()));

        System.out.print("What is the number of times the interest is compounded per year? ");
        accountOwner.setNumTimesCompounded(Integer.parseInt(input.nextLine()));

        System.out.printf("$%.2f invested at %.2f%% for %d year(s) compounded %d times per years is $%.2f", accountOwner.getPrincipal(), accountOwner.getInterestRate(),
                    accountOwner.getYears(), accountOwner.getNumTimesCompounded(), accountOwner.CalculateAmountFinalAndRound());

    }
}
