/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution15 {
    /*
     * print "What is your username? "
     * 'username' = userInput
     * print "What is the password? "
     * 'password' = userInput
     * if(userInput == abc$123)
     *      print "Welcome!"
     * else
     *      print "I don't know you.
     */
    public static void main(String[] args) {
        UserValidation currentUser = new UserValidation();

        currentUser.usernamePrompt();
        currentUser.scanUsername();

        currentUser.passwordPrompt();
        currentUser.scanPassword();

        currentUser.passwordValidation();
    }
}
