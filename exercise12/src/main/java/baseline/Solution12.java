package baseline;

import java.util.Scanner;

public class Solution12 {
    /*
     * Print "Enter the principal: "
     * 'principal' = userInput (string to double)
     * print "Enter the rate of interest: "
     * 'interestRate' = userInput
     * print "Enter the number of years: "
     * 'years' = userInput
     * 'amountFinal' = 'principal' * (1 + ('years' * ('interestRate' / 100)))
     * 'amountFinal' = 'amountFinal' * 100
     * 'amountFinal' = 'amountFinal' + 0.5
     * 'amountFinal' = 'amountFinal' / 100
     * print "After 'years' years at 'interestRate'%, the investment will be worth $'amountFinal'
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleInterestCalculations accountOwner = new SimpleInterestCalculations();

        System.out.print("Enter the principal: ");
        accountOwner.setPrincipal(Double.parseDouble(input.nextLine()));

        System.out.print("Enter the rate of interest: ");
        accountOwner.setInterestRate(Double.parseDouble(input.nextLine()));

        System.out.print("Enter the number of years: ");
        accountOwner.setYears(Integer.parseInt(input.nextLine()));


        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", accountOwner.getYears(), accountOwner.getInterestRate(), accountOwner.CalculateAmountFinalAndRound());
    }
}
