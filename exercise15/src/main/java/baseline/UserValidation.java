/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class UserValidation {
    private static final Scanner input = new Scanner(System.in);
    private String username;
    private String password;

    public UserValidation() {
        this.username = "";
        this.password = "";
    }

    public void usernamePrompt() {
        System.out.print("What is your username? ");
    }

    public void scanUsername() {
        this.username = input.nextLine();
    }

    public void passwordPrompt() {
        System.out.print("What is the password? ");
    }

    public void scanPassword() {
        this.password = input.nextLine();
    }

    public void passwordValidation() {
        if(password.equals("abc$123")) {
            System.out.println("Welcome!");
        }else
            System.out.println("I don't know you.");
    }


}
