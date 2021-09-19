/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution16 {
    /*
     * print "What is your age? "
     * 'userAge' = userInput (String to int)
     * if(userAge >= 16)
     *      print "You are old enough to legally drive."
     * else
     *      print "You are not old enough to legally drive."
     */
    public static void main(String[] args) {
        ValidateAge currentUser = new ValidateAge();

        currentUser.agePrompt();
        currentUser.scanUserAge();

        currentUser.checkAge();
    }
}
