/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class ValidateAge {
    private static final Scanner input = new Scanner(System.in);
    int userAge;

    public ValidateAge() {
        this.userAge = 0;
    }

    public void agePrompt() {
        System.out.print("What is your age? ");
    }

    public void scanUserAge() {
        this.userAge = Integer.parseInt(input.nextLine());
    }

    public void checkAge() {
        System.out.printf("%s", (this.userAge >= 16 ? "You are old enough to legally drive."
                                            : "You are not old enough to legally drive."));
    }
}
