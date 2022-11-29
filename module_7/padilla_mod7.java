/*
Luis Padilla
11/28/22
CSD320 Module 7 Assignment

Some Websites impose certain rules for passwords.
Write a method that checks whether a user's input String is a valid password.
Suppose the password rules are as follows:

A password must have at least eight characters.
A password must contain both letters and digits.
A password must contain at least one uppercase character.
A password must contain at least one lowercase character.

*/


package module_7;

import java.util.Scanner;

public class padilla_mod7 {
    
    // Defining the Password Method
    static void checkPassword(String password) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter your password:\t");
            String pass = input.nextLine();
            System.out.println("You chose \"" + pass + "\" as your password");
        }
        catch (Exception e) {
            System.out.println("Oh no. Something has gone wrong :o\n");
        }
    }
    
    // Main Program
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("\nHello and Welcome to Module 7!\nToday we will be creating and testing a password!\n");
        System.out.println("Your password must:\nBe at least 8 characters long\nContain at least 1 letter and 1 number\nContain at least 1 uppercase letter and 1 lowercase letter\n");

        checkPassword(null);
    }

}
