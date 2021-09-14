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
        int numPeople;
        int numPizzas;
        int slicesPerPizza;

        party1.howManyPeople();
        numPeople = Integer.parseInt(input.nextLine());
        party1.setNumPeople(numPeople);

        party1.howManyPizzas();
        numPizzas = Integer.parseInt(input.nextLine());
        party1.setNumPizzas(numPizzas);

        party1.howManySlicesPerPizza();
        slicesPerPizza = Integer.parseInt(input.nextLine());
        party1.setSlicesPerPizza(slicesPerPizza);

        party1.partyTotal();
        party1.pizzaDivision();

    }
}
