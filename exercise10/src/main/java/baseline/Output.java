package baseline;

public class Output {


    public void pricePrompt(int currentItem) {
        System.out.printf("Enter the price of item %d: ", currentItem);
    }

    public void quantityPrompt(int currentItem) {
        System.out.printf("Enter the quantity of item %d: ", currentItem);
    }

    public void printOutput(ItemCalculations itemsFinal) {
        System.out.printf("Subtotal: $%.2f%n", itemsFinal.getSubtotal());
        System.out.printf("Tax: $%.2f%n", itemsFinal.calculateTax());
        System.out.printf("Total: $%.2f%n", itemsFinal.calculateShopTotal());
    }
}
