package baseline;

import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);
    private double itemPrice;
    private int itemQuantity;

    public UserInput() {
        itemPrice = 0;
        itemQuantity = 0;
    }

    public double scanPrice() {
        this.itemPrice = Double.parseDouble(input.nextLine());

        return this.itemPrice;
    }

    public int scanQuantity() {
        this.itemQuantity = Integer.parseInt(input.nextLine());

        return this.itemQuantity;
    }

}
