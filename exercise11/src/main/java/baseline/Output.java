package baseline;

public class Output {

    public void euroPrompt() {
        System.out.print("How many euros are you exchanging? ");
    }

    public void exchangeRatePrompt() {
        System.out.print("What is the exchange rate? ");
    }

    public void finalOutput(double euros, double exchangeRate, double usDollars) {
        System.out.printf("%.2f euros at an exchange rate of %.4f is%n%.2f U.S. dollars.%n", euros, exchangeRate, usDollars);
    }
}
