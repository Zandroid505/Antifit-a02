/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class PizzaCalculations {
    private int numPeople;
    private int numPizzas;
    private int slicesPerPizza;

    PizzaCalculations() {
        this.numPeople = 0;
        this.numPizzas = 0;
        this.slicesPerPizza = 0;
    }

    public void howManyPeople() {
        System.out.print("How many people? ");
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public void howManyPizzas() {
        System.out.print("How many pizzas do you have? ");
    }

    public void setNumPizzas(int numPizzas) {
        this.numPizzas = numPizzas;
    }

    public void howManySlicesPerPizza() {
        System.out.print("How many slices per pizza? ");
    }

    public void setSlicesPerPizza(int slicesPerPizza) {
        this.slicesPerPizza = slicesPerPizza;
    }

    public int totalSlices() {
        return (this.slicesPerPizza * this.numPizzas);
    }

    public void partyTotal() {
        System.out.printf("%d people with %d pizzas (%d slices)%n", numPeople, numPizzas, totalSlices());
    }

    public int slicesPerPerson() {
        return(totalSlices() / this.numPeople);
    }

    public int slicesLeft() {
        return(totalSlices() % numPeople);
    }

    public void pizzaDivision() {
        System.out.printf("Each person gets %d pieces of pizza.%n", slicesPerPerson());
        System.out.printf("There are %d leftover pieces.%n", slicesLeft());
    }


}
