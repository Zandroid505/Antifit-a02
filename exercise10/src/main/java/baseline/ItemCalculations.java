package baseline;

public class ItemCalculations {
    private double itemPrice;
    private int itemQuantity;
    private double itemTotalPrice;
    private static double subtotal = 0;
    private static double tax = 0;
    private static final double TAX_RATE = 0.055;



    public ItemCalculations() {
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemTotalPrice = 0;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void calculateTotalItemPrice() {
        this.itemTotalPrice = this.itemPrice * this.itemQuantity;
        subtotal += this.itemTotalPrice;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public static double calculateTax() {
        tax = subtotal * TAX_RATE;

        return tax;
    }

    public static double calculateShopTotal() {
        return (subtotal + tax);
    }
}
