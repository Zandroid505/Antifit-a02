package baseline;

public class TaxCalculations {
    private double tax;

    public TaxCalculations() {
        this.tax = 0;
    }

    public void checkStateAndCalculateTax(String userState, double orderAmount) {
        String stateWithTax = "WI";
        if(userState.equals(stateWithTax)) {
            this.tax = 0.055 * orderAmount;
        }
    }

    public double getTax() {
        return this.tax;
    }

    public double calculateTotal(double orderAmount) {
        double total = this.tax + orderAmount;

        if (total >= (total + 0.001)) {
            total *= 100;
            total += 0.5;
            total /= 100;
        }

        return total;
    }
}
