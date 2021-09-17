package baseline;

public class ConversionCalculation {
    private double euros;
    private double exchangeRate;
    private double usDollars;

    ConversionCalculation(double euros, double exchangeRate) {
        this.euros = euros;
        this.exchangeRate = exchangeRate;
        this.usDollars = 0;
    }

    public double getEuros() {
        return this.euros;
    }

    public double getExchangeRate() {
        return this.exchangeRate;
    }

    public double calculateUSDollars() {
        this.usDollars = this.euros * this.exchangeRate;

        //Rounds decimal up one cent if fractional
        if (this.usDollars >= (this.usDollars + 0.001)) {
            this.usDollars *= 100;
            this.usDollars += 0.5;
            this.usDollars /= 100;
        }

        return(this.usDollars);
    }
}
