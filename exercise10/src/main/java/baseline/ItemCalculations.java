package baseline;

public class ItemCalculations {
    private double itemPrice;
    private int itemQuantity;
    private double itemTotalPrice;
    private static double subtotal;
    private static final double TAX_RATE = 0.055;

    public ItemCalculations() {
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemTotalPrice = 0;
        subtotal = 0;
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

    public double calculateTax() {
        return (subtotal * TAX_RATE);
    }

    public double calculateShopTotal() {
        return (subtotal + calculateTax());
    }
}
