package baseline;

import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);
    private double euros;
    private double exchangeRate;

    public UserInput() {
        this.euros = 0;
        this.exchangeRate = 0;
    }

    public double scanEuros() {
        this.euros = Double.parseDouble(input.nextLine());

        return this.euros;
    }

    public double scanExchangeRate() {
        this.exchangeRate = Double.parseDouble(input.nextLine());

        return this.exchangeRate;
    }


}
