package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private double orderAmount;
    private String userState;

    public UserInput() {
        this.orderAmount = 0;
        this.userState = "";
    }

    public void convertAndSetOrderAmount() {
        this.orderAmount = Double.parseDouble(input.nextLine());
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setUserState() {
        this.userState = input.nextLine();
    }

    public String getUserState() {
        return userState;
    }
}
