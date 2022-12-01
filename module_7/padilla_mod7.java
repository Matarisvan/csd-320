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
    static void getPassword(String password) {
        try(Scanner input = new Scanner(System.in)) {
            
            // Define variables
            int passLoop = 0;
            int passCheck;
            int passNum;
            int i;
            int j;

            // Password Loop
            do {
                passCheck = 0;
                
                // Get password from user
                System.out.println("Please enter your password:\t");
                String pass = input.nextLine();
                System.out.println("You chose \"" + pass + "\" as your password");
                
                // Checks length
                if (pass.length() > 7) {
                    System.out.println("\nlong enough");
                    passCheck++;
                } else {
                    System.out.println("\nPassword too short");
                }

                // Checks Lowercase
                String passU = pass.toUpperCase();
                if (pass.equals(passU)) {
                    System.out.println("You need a lowercase letter");
                } else {
                    System.out.println("lowercase detected");
                    passCheck++;
                }                

                // Checks Uppercase
                String passL = pass.toLowerCase();
                if (pass.equals(passL)) {
                    System.out.println("you need an uppercase letter");
                } else {
                    System.out.println("uppercase detected");
                    passCheck++;
                }

                // Checks for Number
                char[] passD = pass.toCharArray();
                j = 1;
                passNum = 0;
                for (i = pass.length() ; j <= i ; j++) {
                    for(char pd : passD)
                        if (Character.isDigit(pd)) {
                            passNum++;
                            break;
                        }
                }
                if (passNum != 0) {
                    System.out.println("number detected");
                    passCheck++;
                } else {
                    System.out.println("you need a number");
                }

                // Checks all requirements
                System.out.println("\nYour password has passed " + passCheck + " out of 4 requirements");
                if (passCheck == 4) {
                    int exit = 0;
                     System.out.print("\nWould you like to try another password?\n1 = Yes\n2 = No\n");
                    while (exit == 0) {
                        String passEx = input.nextLine();
                        if (passEx.equalsIgnoreCase("1")) {
                            exit++;
                            break;
                        } else if (passEx.equalsIgnoreCase("2")) {
                            exit++;                            
                            passLoop++;
                        } else {
                            System.out.println("\nPlease select an option\n1 = Rerun Program\n2 = Exit");
                        }
                    }
                }

            } while (passLoop == 0);

        } catch (Exception e) {
            System.out.println("\nOh no. Something has gone wrong :o\n");
        } 
    }


    // Main Program
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("\nHello and Welcome to Module 7!\nToday we will be creating and testing a password!\n");
        System.out.println("Your password must:\nBe at least 8 characters long\nContain at least 1 letter and 1 number\nContain at least 1 uppercase letter and 1 lowercase letter\n");

        // calls getPassword method
        getPassword(null);

        // Final Message
        System.out.println("\nThank You for trying this Program! :)\n");
    }
    
}
