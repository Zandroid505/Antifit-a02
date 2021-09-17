package baseline;

public class Output {


    public void pricePrompt(int currentItem) {
        System.out.printf("Enter the price of item %d: ", currentItem);
    }

    public void quantityPrompt(int currentItem) {
        System.out.printf("Enter the quantity of item %d: ", currentItem);
    }

    public void printOutput(double subtotal, ItemCalculations item) {
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", item.calculateTax(subtotal));
        System.out.printf("Total: $%.2f%n", item.calculateShopTotal(subtotal));
    }
}
