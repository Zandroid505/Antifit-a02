/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class Solution08 {
    /*
     * print "How many people?"
     * 'numPeople' = userInput (convert string to int)
     * print "How many pizzas do you have?"
     * 'numPizzas' = userInput
     * print "How many slices per pizza?"
     * 'slicesPerPizza' = userInput
     * 'totalSlices' = 'slicesPerPizza' * 'numPizzas'
     * print "'numPeople' people with 'numPizzas' pizzas ('totalSlices' slices)
     * 'slicesPerPerson' = 'totalSlices' / 'numPeople'
     * 'slicesLeft' = 'totalSlices' % 'numPeople'
     * print "Each person gets 'slicesPerPerson' pieces of pizza."
     * print "There are 'slicesLeft' leftover pieces."
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PizzaCalculations party1 = new PizzaCalculations();

        party1.howManyPeople();
        party1.setNumPeople(party1.stringToInt(input.nextLine()));

        party1.howManyPizzas();
        party1.setNumPizzas(party1.stringToInt(input.nextLine()));

        party1.howManySlicesPerPizza();
        party1.setSlicesPerPizza(party1.stringToInt(input.nextLine()));

        party1.partyTotal();
        party1.pizzaDivision();


    }
}
